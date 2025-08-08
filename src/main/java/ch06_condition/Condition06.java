package ch06_condition;

import java.util.Scanner;

/*
    고민해봐야 할 사항
    Condition05는
    100 초과/ 0 미만의 점수가 입력됬을 때 각각 A/F 라는 점수가 나온다
    잘못된 점수 입력시 불가능한 입력이라는 제약을 걸 필요가 존재

    100 초과 0 미만의 경우 grade를 X 라고 설정(중첩 IF문 사용 금지)
 */
public class Condition06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요 >>> ");
        int score = scanner.nextInt();
        String grade;

        if (score < 0 || score > 100) { // false 라면 score는 0 이상 100 이하
            grade = "X";
        } else if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        if (grade.equals("X")) {
            System.out.println("잘못된 점수입니다.");
        } else {
            System.out.println("당신의 점수는 " + score + "점이고 학점은 "  + grade + "입니다.");
        }
    }
}
