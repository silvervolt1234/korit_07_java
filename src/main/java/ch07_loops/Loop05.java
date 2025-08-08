package ch07_loops;

import java.util.Scanner;

/*
    중첩 for 문도 가능합니다
    for (int i = 0 ;  i < 100 ; i++) {
        반복실행문1-a
        for(int j = 0 ; j < 100 ; j++) {
            반복실행문2
        }
        반복실행문1-b
    }
    for 문을 활용해 1일차 1교시입니다 ~ 5일차 3교시입니다 까지 출력하시오
    구구단 for 문으로 출력하시오
 */
public class Loop05 {
    public static void main(String[] args) {
//        for (int i = 1 ; i < 6 ; i++) {
//            for (int j = 1; j < 4; j++) {
//                System.out.println(i + "일차 " + j + "교시입니다");
//            }
//            System.out.println();
//        }
//        for (int i = 2 ; i < 10 ; i++) {
//            for (int j = 1 ; j < 10 ; j++) {
//                System.out.println(i + " x " + j + " = " + (i*j));
//            }
//            System.out.println();
//        }
        /*
        1 2 3 4 5 ... 10
        11 ... 20
        91 ... 100
         */
        for (int i = 1; i < 101; i++) {
            System.out.print(i + " ");
            if (i % 10 == 0) {  // 10개 출력할 때마다 줄 바꿈
                System.out.println();
            }
        }
        System.out.println();

        for (int j = 1; j < 101; j += 10) {
            System.out.println(j + " " + (j+1) + " " + (j+2) + " " + (j+3)+ " " + (j+4)+ " " + (j+5)+ " " + (j+6) + " " + (j+7)+ " " + (j+8)+ " " + (j+9));
        }

        /*
            숫자를 입력 받아 n까지 더하는 반복문을 for 문으로 작성
            실행 예
            1부터 몇 까지 더하시겠습니까? >>> 10
            1부터 10까지의 합은 55입니다
            
            1부터 10까지 중 짝수의 합을 도출
         */
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("1부터 몇까지 더하시겠습니까? >>>");
//        int num = scanner.nextInt();
//        int sum = 0;
//
//        for (int i = 1; i < (num+1) ; i++) {
//            sum += i;
//        }
//        System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다");
//        System.out.println();
//
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.print("1부터 몇까지 더하시겠습니까? >>>");
//        int n = scanner1.nextInt();
//        int sum1 = 0;
//        for (int j = 1; j < (n+1); j++) {
//            if (j % 2 == 0) {
//                sum1 += j;
//            }
//        }
//        System.out.println("1부터 " + n +"까지의 짝수의 합은 " + sum1 + "입니다");

        Scanner scanner = new Scanner(System.in);
        System.out.print("1부터 몇까지 더하시겠습니까? >>>");
        int n = scanner.nextInt();
        int sum = 0;
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 1; i < n+1 ; i++) {
            sum += i;
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
        System.out.println("1부터 " + n + "까지 짝수의 합은 " + sumEven + "입니다.");
        System.out.println("1부터 " + n + "까지 홀수의 합은 " + sumOdd + "입니다.");
    }
}
