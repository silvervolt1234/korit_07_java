package ch09_classes;

import java.util.Scanner;

/*
    method - 순차적으로 실행되는 여러 코드들을 하나의 이름으로 묶은 것
        call1() ~ call4()로 매개변수/return 윰 구분

    형식:
        (접근지정자) 리런타입 메서드명(매개변수1, 매개변수2) {
            메서드 내부에서 순차적 실행 코드들 -> 비지니스 로직
        }

    ex)
    정의 예시:
        public void writeSchedule(String date, String content) {
            System.out.println(date + "일의 스케쥴은 다음과 같습니다.");
            System.out.println(content);
        }
    호출 예시:
        객체명.writeSchedule("20250804", "메서드/오버로딩/클래스 복습");
 */
public class ReviewMethod {
    // 메서드 정의 영역
    public void writeSchedule(String date, String content) {
        System.out.println(date + "일의 스케쥴은 다음과 같습니다.");
        System.out.println(content);
    }

    public void writeSchedule2(int date, String content) {
        System.out.println(date + "일의 스케쥴은 다음과 같습니다.");
        System.out.println(content);
    }
    // 1. 메서드 자료형 변경
    // writeSchedule을 overloading 하여 매개변수1의 자료형을 int로 바꾸고
    // writeSchedule(20250805, "클래스/getter/setter 예습"); 호출

    // 2. call2() 유형으로 작성
    // dividedBySeven 메서드를 정의
    // 특정 int 숫자 하나를 맥변수로 받아 그 숫자가 7의 배수인지 아닌지 확인하는 메서드 작성
    // ex)
    // 임의의 숫자를 입력하세요 >>> 77
    // 77은 7의 배수입니다
    // 임의의 숫자를 입력하세요 >>> 100
    // 100은 7의 배수가 아닙니다

    // 3. overloading을 통해서 call1() 유형으로도 생성
    
    public void dividedBySeven(int number) {
        // 지역 변수 선언
        String answer = "";
        if (number % 7 == 0) {
            answer = " 7의 배수입니다.";
        } else {
            answer = " 7의 배수가 아닙니다.";
        }
        System.out.println(number + "은(는)" + answer);
    }
    
    // overloading이 적용된 call1() 유형
    public void dividedBySeven2() {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.print("임의의 숫자를 입력하세요 >>> ");
        int num1 = scanner.nextInt();       // 여기 method의 return 값이 num 이라는 변수에 저장
//        if (num1 % 7 == 0) {
//            System.out.println(num1 + "은(는) 7의 배수입니다.");
//        } else {
//            System.out.println(num1 + "은(는) 7의 배수가 아닙니다.");
//        }
        dividedBySeven(num); // method 내부에서 다른 method 호출 가능
    }



    public static void main(String[] args) {
        // 메서드 호출 영역
        ReviewMethod reviewMethod = new ReviewMethod();
        reviewMethod.writeSchedule("20250804", "메서드/오버로딩/클래스 복습");
        reviewMethod.writeSchedule2(20250805, "클래스/getter/setter 예습");

        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.print("임의의 숫자를 입력하세요 >>> ");
        num = scanner.nextInt();
        reviewMethod.dividedBySeven(num);

        reviewMethod.dividedBySeven2();  // argument가 없기에 method 내부에서 변수 사용
    }
}