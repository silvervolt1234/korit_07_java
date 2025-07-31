package ch08_methods;

import java.util.Scanner;

public class Method01 {
    /*
    여기에 메서드 정의
    이후부터는 main 없을 수도 있음
     */
    
    // 메서드 정의 영역
    // 1. [ x | x ] [ 입력값 / 출력값 ]
    public static void call1() {
        System.out.println("[ x | x ]");
    }

    // 2. [ o | x ] 매개변수
    public static void call2(String example) {
        System.out.println("[ o | x ]");
        System.out.println("영어 인사 : " + example);
    }

    // 3. [ x | o ]
    public static String call3() {
        String example = "안녕하세요";
        System.out.println("[ x | o ]");
        return example;
    }

    // 4. [ o | o ]
    public static double call4(double score) {
        System.out.println("[ o | o ]");
        System.out.println("해당 과목은 3학점짜리입니다");
        return score * 3;
    }
    
    /*
        return이 있는 이유는 기본적으로 데이터 조작을 위해서. 그리고 특정 메서드의 결과값이
        다른 메서드의 argument로 사용 가능
        
        함수형 프로그래밍(Functional Programming) :
            메서드 1의 return 값이 메서드 2의 argument가 되고 메서드 2의 return 값이
            메서드 3의 argument가 되는 방식으로
            첫 번째 메서드로부터 마지막 메서드까지의 흐름을 통해 프로그램이 이어지는 코딩 방식

            ex)
     */
    public static String introduce(String name, int age) {
        return "제 이름은" + name +" 이고, 나이는 " + age +"살 입니다.\n내년에는 " + (age + 1) + " 살이 됩니다";
    }

    public static void main(String[] args) {
        // 메서드 호출 영역
        call1();
        call2("hello");        // String형 삽입 필요 // 특정 데이터를 요구시 사용

        // return 값을 출력하기 위해서는 System.out.println(); 필요
        System.out.println(call3());
        String name = "김일";
        System.out.println(name + " 학생의 학점은 " + call4(4.5) + "점 입니다"); // 결과 값에 추가적인 연산을 위해 return 사용



        Scanner scanner = new Scanner(System.in);
        String myName = "";
        int myAge = 0;
        System.out.print("이름을 입력하세요 >>>");
        myName = scanner.nextLine();                // 이 nextLine();이 메서드 -> 메서드의 결과값을 myName이라는 변수에 저장

        System.out.print("나이를 입력하세요 >>>");
        myAge = scanner.nextInt();
        System.out.println(introduce(myName, myAge));      // myName, myAge 라는 결과 값을 정의한 introduce() 메서드의
        // argument로 사용해 최종 결과물을 콘솔에 출력
    }
}
