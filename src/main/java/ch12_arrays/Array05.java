package ch12_arrays;

import java.util.Scanner;

/*
    메서드 정의/main 직접 무관
    String[] scores 배열에
    A / B / C / D / F element를 입력
    실행 예
    A+ B+ C+ D+ F
    가 되도록 코드를 작성하시오
 */
public class Array05 {
    // 메서드 정의 구간

    public void printScore(String[] strScore) {
        for (int i = 0 ; i < strScore.length ; i ++) {
            if (i < strScore.length - 1) {
                System.out.print(strScore[i] + "+" + " ");
            } else {
                System.out.println(strScore[i]);
            }
        }
    }

    public void writeScore(String[] scores) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.print((i+1) + "번째 element를 채우시오 >>> ");
            scores[i] = scanner.nextLine();
        }
    }


    public static void main(String[] args) {
        String[] score = {"A", "B", "C", "D", "F"};
        // 출력하는 반복문 -> A B C D만 출력 후 + 부착
        // 마지막 인덱스는 그냥 출력
        for (int i = 0 ;  i < score.length - 1 ; i++) {
            System.out.print(score[i] + "+" + " ");
        }
        System.out.print(score[score.length-1]);
        System.out.println();

        Array05 array05 = new Array05();
        String[] scores = new String[5];
        array05.writeScore(scores);
        array05.printScore(scores);
    }
}
