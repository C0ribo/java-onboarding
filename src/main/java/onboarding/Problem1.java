package onboarding;

import java.util.List;

class Problem1 {
    /*
    * 어떠한 메서드를 만들것인가?
    * 주어진것: 최소 1페이지~최대 400페이지의 책, 포비가 이기면 = 1, 크롱이 이기면 2 무승부 0 , 예외 -1
    *
    * 1. 페이지를 각각 자리 숫자로 바꾸는 메서드
    * 2. 각 페이지를 더하는 메서드
    * 3. 각 페이지를 곱하는 메서드
    * 4. 더한 값과 곱한 값의 최대값을 뽑는 메서드
    * */
    public void leftRightPage(List<Integer> pages){
        int left = pages.get(0); // left는 홀수
        int right = pages.get(1); // right = 짝수

        if(1 < left || left < 400){

        }
    }

    public int[] changeToNum(int pageNum){ // 페이지 100의자리 10의 자리 등등
        int onePage = pageNum % 10;// get(0), get(1) 왼, 오 일의 자리
        int twoPage = (pageNum % 100 ) / 10;
        int threePage = ((pageNum % 1000) / 100);

        int[] digits = { onePage, twoPage, threePage};

        return digits;
    }

    public int numAddMultiplerPage(int pageNum){ // 더하는 곱하는 메서드
        int[] digits = changeToNum(pageNum);
        int addNum = 0;
        int multiplerNum = 1;
        for(int digit : digits){
            addNum += digit;
            multiplerNum *= digit;
        }
        int MAX_VALUE = Math.max(addNum, multiplerNum);
        return MAX_VALUE;
    }

    public int scoreCompareToNum(List<Integer> pages){ // 점수를 비교해 가장 높은 사람
        int leftScore = numAddMultiplerPage(pages.get(0));
        int rightSocre = numAddMultiplerPage(pages.get(1));

        return Math.max(leftScore, rightSocre);
    }
    public static int solution(List<Integer> pobi, List<Integer> crong) { // 해결하는 메서드인듯
        Problem1 b1 = new Problem1();

        b1.leftRightPage(pobi);
        b1.leftRightPage(crong);

        int pobiScore = b1.scoreCompareToNum(pobi);
        int crongScore = b1.scoreCompareToNum(crong);

        if(pobiScore > crongScore)
            return 1;
        if (pobiScore < crongScore)
            return 2;
        return 0;


        //int answer = Integer.MAX_VALUE; // answer 과 최대값
        //return answer;
    }

}