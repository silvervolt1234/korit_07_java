package ch12_arrays;
/*
    내부 element의 값들의 점수 범위를 조사해
    90 이상은 A
    80 이상은 B
    70 이상은 C
    60 이상은 D
    59 이하는 F 일때
    각 점수별 인원 수를 출력
 */

import java.util.Scanner;

public class Array07 {
    // 메서드 정의: 등급 분포 출력
    public static void printScore(int[] scores) {
        int[] grade = {0, 0, 0, 0, 0};

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > 89) {
                grade[0]++;
            } else if (scores[i] > 79) {
                grade[1]++;
            } else if (scores[i] > 69) {
                grade[2]++;
            } else if (scores[i] > 59) {
                grade[3]++;
            } else {
                grade[4]++;
            }
        }

        System.out.println("A 학생 수 : " + grade[0]);
        System.out.println("B 학생 수 : " + grade[1]);
        System.out.println("C 학생 수 : " + grade[2]);
        System.out.println("D 학생 수 : " + grade[3]);
        System.out.println("F 학생 수 : " + grade[4]);
    }


    public static void main(String[] args) {
        int[] scores = {100, 97, 83, 85, 77, 76, 64, 64, 58, 59, 92, 100};
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;

        // int[] =/= int
        for (int i = 0 ; i <scores.length ; i++) {
            if (scores[i] > 89) {
                a++;
            } else if (scores[i] > 79) {
                b++;
            } else if (scores[i] > 69) {
                c++;
            } else if (scores[i] > 59) {
                d++;
            } else {
                f++;
            }
        }
        System.out.println("A 학생 수 : " + a);
        System.out.println("B 학생 수 : " + b);
        System.out.println("C 학생 수 : " + c);
        System.out.println("D 학생 수 : " + d);
        System.out.println("F 학생 수 : " + f);

        // 이제 고민할 부붑 -> 변수 a b c d f가 하나하나 int 이기에
        // int[] 배열로 선언해 변수 개수 감소 가능
        int[] grade = {0, 0, 0, 0, 0};
        // A에 해당하는 점수라면 grade[0] 숫자를 +1 해주고, B에 해당하면 grade[1] +1...
        // 여러줄 사용 필요 x

        System.out.println();
        printScore(scores);
    }
}
