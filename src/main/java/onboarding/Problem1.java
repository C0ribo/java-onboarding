package onboarding;

import java.util.List;

class Problem1 {

    static final int EXCEPT_VALUE = -1; // 예외사항 -> 책이 연달아 펴지질 않음
    static final int POBI_WIN = 1; // 포비가 이겼을 때 1
    static final int CRONG_WIN = 2; // 크롱이 이겼을 때 2
    static final int SAME_VALUE = 0; // 둘이 무승부였을 때 0
    static final int BOOK_MIN_VALUE = 1; // 책의 최소페이지 1
    static final int BOOK_MAX_VALUE = 400; // 책의 최대페이지 400

    public static int solution(List<Integer> pobi, List<Integer> crong) { // 해결하는 메서드인듯
        int answer = Integer.MAX_VALUE; // answer 과 최대값
        return answer;
    }

    /*
    * 어떠한 메서드를 만들것인가?
    * 주어진것: 최소 1페이지~최대 400페이지의 책, 포비가 이기면 = 1, 크롱이 이기면 2 무승부 0 , 예외 -1
    *
    * 1. 페이지를 각각 자리 숫자로 바꾸는 메서드
    * 2. 각 페이지를 더하는 메서드
    * 3. 각 페이지를 곱하는 메서드
    * 4. 더한 값과 곱한 값의 최대값을 뽑는 메서드
    * */
    public static void checkRightAndLeft(List<Integer> pages){ // 왼쪽 오른쪽
        int left = pages.get(0);
        int right = pages.get(1);
    }

    public static int[] changeToNum(int pageNum){ // 페이지 100의자리 10의 자리 등등
        int onePage = pageNum % 10;// get(0), get(1) 왼, 오 일의 자리
        int twoPage = (pageNum % 100 ) / 10;
        int threePage = ((pageNum % 1000) / 100);

        int[] digit = { onePage, twoPage, threePage};

        return digit;
    }

    public static int numAddPage(int pageNum){ // 더하는 메서드
        int[] digit = changeToNum(pageNum);
        int addNum = 0;
        for(int digits : digit){
            addNum += digits;
        }

        return addNum;
    }

}