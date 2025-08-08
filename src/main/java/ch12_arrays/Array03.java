package ch12_arrays;

import java.util.Scanner;

/*
    몇 명의 학생들 등록하시겠습니까? >>> 5
    1 번 학생의 이름을 등록하세요 >>> 김일
    김일 학생의 점수를 등록하세요 >>> 4.5
    2 번 학생의 이름을 등록하세요 >>> 김이
    김이 학생의 점수를 등록하세요 >>> 4.4
    3 번 학생의 이름을 등록하세요 >>> 김삼
    김삼 학생의 점수를 등록하세요 >>> 4.3
    4 번 학생의 이름을 등록하세요 >>> 김사
    김사 학생의 점수를 등록하세요 >>> 4.2
    5 번 학생의 이름을 등록하세요 >>> 김오
    김오 학생의 점수를 등록하세요 >>> 4.1

    김일  김이  김삼  김사   김오
    4.5  4.4   4.3   4.2   4.1
*/
public class Array03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        System.out.print("몇 명의 학생을 등록하시겠습니까 >>> ");
        index = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[index];
        double[] scores = new double[index];
        double sum = 0;

        for (int i = 0; i < names.length; i++) {
            System.out.print((i + 1) + "번 학생의 이름을 등록하세요 >>> ");
            names[i] = scanner.nextLine();
            System.out.print(names[i] + " 학생의 점수를 등록하세요 >>> ");
            scores[i] = scanner.nextDouble();
            scanner.nextLine(); // 바로 위에 nextDouble() 다음에 i++ 이후 nextLine()이 배치되서 배리어 배치
            sum += scores[i];
        }
        System.out.println();

        // 각 배열의 element를 출력하는 반복문 작성 필요 -> names 출력 후 개힝이 이루어지고 다음 scores 출력
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < names.length; i++) {
            System.out.print(scores[i] + " ");
        }
        System.out.println();
    }
}
