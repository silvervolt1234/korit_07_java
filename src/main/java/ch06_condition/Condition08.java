package ch06_condition;

import java.util.Scanner;

/*
    과제:
    윤년 계산기 작성
    윤년을 판단하는 규칙은
    1. 연도가 4로 나누어 떨어지는 해는 윤년에 해당할수도 있음
    2. 100으로 나누어지는 해는 윤년이 아님
    3. 100으로 나우어 떨어지기도 하는데 400으로도 나누어 떨어지면 윤년에 해당

    ex)
    2020년은 4로 나누어 떨어져서 윤년
    1900년은 100의 배수이기에 윤년이 아님
    2000년은 100의 배수이자 400의 배수여서 윤년

    이상의 조건을 만족하는 계산기를 작성하고
    Scanner를 import에 year에 값을 대입했을때 윤년 여부를 판단하시오
 */
public class Condition08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("연도를 입력하세요 >>> ");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
               if (year % 400 == 0) {
                   System.out.println("윤년");
               } else {
                    System.out.println("평년");
                }
            } else {
                System.out.println("윤년");
            }
        } else {
            System.out.println("평년");
        }


//        String leapYear;
//        if (year % 400 == 0) {
//
//        } else if (year % 100 == 0) {
//            leapYear = "윤년이 아닙니다";
//        } else if (year % 4 == 0) {
//
//        } else {
//            leapYear = "윤년이 아닙니다";
//        }
//
//        System.out.println(year + "년은 " + leapYear);
    }
}
