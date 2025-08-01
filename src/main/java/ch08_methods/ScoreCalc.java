package ch08_methods;

import java.util.Scanner;

/*
    점수들을 입력 받아서 총합 및 평균을 내는 프로그램 작성
 */
public class ScoreCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double avg = 0;
        int numOfSubs = 0;

        // 3 과목의 점수를 입력받아서 총합과 평균을 콘솔에 표시하시오
        /*
            실행 예
            몇 과목의 점수를 입력하시겠습니까? >>> 3
            1 과목의 점수를 입력하세요 >>> 100
            2 과목의 점수를 입력하세요 >>> 90
            3 과목의 점수를 입력하세요 >>> 95
         */
        System.out.print("몇 과목의 점수를 입력하시겠습니까? >>> ");
        numOfSubs = scanner.nextInt();
        for (int i = 1 ; i < (numOfSubs + 1) ; i++) {
            System.out.print((i+1) + " 과목의 점수를 입력하세요 >>> ");
            sum += scanner.nextDouble();
        }
        avg = (sum / numOfSubs );

        System.out.println(numOfSubs + " 과목의 합계는 " + sum + "점이고, 평균은 " + avg + "점입니다.");
    }
}
