package ch07_loops;

import java.util.Scanner;

/*
    for 반복문(for loop)
    : 대부분의 경우 명확한 횟수가 고정되어 있을 때 사용하는 반복문
    (이전까지는 while에 반복횟술을 고정시킨채로 시작했지만 for문 사용이 훨씬 편리)

    형식 :
    for(시작값 ; 종료값 ; 증감값) {
        반복실핼문
    }
 */
public class Loop04 {
    public static void main(String[] args) {
        // 1부터 100까지 출력하는 for문
//        for(int i = 1 ; i < 101 ; i++) {
//            System.out.println(i);
//        }
        // 1부터 100까지의 합을 구하고 한번만 출력(for문 사용)
//        int sum = 0;
//        for(int i = 1 ; i < 101 ; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
        // 1부터 100까지 중 홀수 합을 구하는 for 문을 작성하시오
        // 1. for문 내부에 중첩 if문 사용
        // 2. 증갑값을 건드려서 작성
//        int sum = 0;
//        for (int i = 1 ; i < 101 ; i++) {
//            if (i % 2 == 1) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);
//
//        int sum1 = 0;
//        for (int i = 1 ; i < 101 ; i += 2) {
//            sum1 += i;
//        }
//        System.out.println(sum1);

        /*
            숫자를 입력받아 1부터 n까지 더하는 반복문 작성

            실행 예
            1부터 몇까지 더하시겠습니까? >>> 10
            1부터 10까지의 합은 55입니다
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("1부터 몇까지 더하시겠습니까? >>>");
        int num = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i < (num+1) ; i++) {
            sum += i;
        }
        System.out.println("1부터 " + num + "까지의 합은 " + sum + "입니다");
    }
}
