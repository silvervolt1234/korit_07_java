package ch09_classes;

import java.util.Scanner;

/*

 */
public class ClassAMain {
    public static void main(String[] args) {
        // 객체 생선
        ClassA classA1 = new ClassA();
        Scanner scanner = new Scanner(System.in);

        // 그리고 객체의 메서드(기능)을 호출
        scanner.nextLine();
        // ClassA에 선언된 변수들에 값을 대입
        // 객체명.속성명 = 데이터;
        classA1.num = 1;
        classA1.name = "김일";
        classA1.score = 4.2;

        System.out.println(classA1.name + "학생의 " +
            "학번은 " + classA1.num + "번이고 점수는" +
            classA1.score + "점입니다."
        );

        // 메서드 호출 방법
        // 객체명.메서드명()
        classA1.callName(); // scanner.nextLine()과 같은 방식
    }
}
