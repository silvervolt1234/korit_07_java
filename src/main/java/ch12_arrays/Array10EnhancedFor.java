package ch12_arrays;
/*
    향상된 for문(Enhanced For Loop)

    일반 for 문과의 차이점 :
        일반 for 문의 경우 index 넘버(주소지)를 명확히 알기에
        일일히 element의 숫자를 세는 것이 번거로워서
        일종의 field 참조를 통해 int 추출로 대입

        하지만 for (int i = 0; ...) 부분에서 int i는 for문 내부에서 선언되고 내부 사용만 가능

        이를 응용해 배열 내의 element에 for문 내부에서만 사용하는 변수에 대입하는 방식으로
        index 넘버(주소지)의 사용없이 적용할 수 있는 for 반복문이 있는데 이것이 향상된 for문

    제약 :
        읽기만 가능하고 쓰기 불가능

    형식 :
    for(자료형 변수명 : 반복 가능 객체(배열)) {
        반복 실행문
    }
 */
public class Array10EnhancedFor {
    public static void main(String[] args) {
        int[] num = new int[200];

        // 1부터 200까지 대입

        // 일반 for 문 형태로 1 2 3 4...200까지 출력
        for (int i = 0 ; i < num.length ; i++) {
            num[i] = (i + 1);
            System.out.print(num[i] + " ");
        }
        System.out.println();
        // 향상된 for 문 출력
        for (int number : num) {
            System.out.print(number + " ");
            // 첫 번째 반복에서 num 의 첫 번재 element인 1을 number에 대입
            // 즉 number = 1; 이 된 상황 -> 36번 라인
            // 대입이 된 상태로 37번 라인 실행 -> 1 까지 출력
            // 다음 반복으로 넘어가 num 의 두 번째 element인 2를 number에 대입
            // 37번 실행 -> 다음 3 대입
            // 39번 대입.....200 대입
            // 39번 실행하고 마무리(마무리 시점은 마지막 element 대입 후, 반복 실행문 실행 후)
            // 이후 반복문 바깥에서는 int i 와 동일하게 number 변수 사용 불가
        }
        // number = 201;    // 에러
        System.out.println();
        
        // String 배열에 김일, 김이, 김삼, 김사, 김오라는 element를 가지도록 작성하고
        // 일반 for 문으로 김일 김이 김삼 김사 김오 출력
        // 향상된 for 문으로 동일하게 출력
        String[] names = {"김일", "김이", "김삼", "김사", "김오"};
        for (int i = 0 ; i < names.length ; i++) {
            System.out.print(names[i] + " ");
        }

        System.out.println();
        for(String name : names) {
            System.out.print(name + " ");
        }
    }
}