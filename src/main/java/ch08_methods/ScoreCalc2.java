package ch08_methods;

import java.util.Scanner;

public class ScoreCalc2 {
    // method 정의 영역
    // call1()유형으로 작성
    public static void calcSumAndAvg() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double avg = 0;
        int numOfSubs = 0;

        System.out.print("몇 과목의 점수를 입력하시겠습니까? >>> ");
        numOfSubs = scanner.nextInt();
        for (int i = 1 ; i < (numOfSubs + 1) ; i++) {
            System.out.print(i + " 과목의 점수를 입력하세요 >>> ");
            sum += scanner.nextDouble();
        }
        avg = (sum / numOfSubs );
        System.out.println(numOfSubs + " 과목의 합계는 " + sum + "점이고, 평균은 " + avg + "점입니다.");
    }


    public static void main(String[] args) {
        // 메서드 호출 영역
        calcSumAndAvg();
        // 이상과 같이 호출했을 때 아까와 동일한 기능을 하게 작성하시오
    }
}
