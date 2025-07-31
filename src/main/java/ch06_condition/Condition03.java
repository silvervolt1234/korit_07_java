package ch06_condition;

import java.util.Scanner;

/*
    if - else if 문 : if - else 문과 달리 else if 에는 별도의 조건식이 요구
        그리고 else if는 여러 개 나올 수 있다.

    형식 :
    if(조건식1) {
        실행문1
    } else if(조건식2) {
        실행문2
    } else if(조건식3) {
        실행문3
    }
 */
public class Condition03 {
    public static void main(String[] args) {
        // Scanner 클래스 import
        Scanner scanner = new Scanner(System.in);

        // 변수 / 상수 선언 및 초기화
        int point = 0;
        // 상수 개념 설명 -> 초기화 필수
        final int VIP_POINT = 80;       // final 키워드가 붙으면 재대입 불가능
        final int GOLD_POINT = 60;      // 변함없는 데이터를 사용할 때
        final int SILVER_POINT = 40;    // 사용하는데 변함없는 데이터임을 개발자들이 알아보기 위해
        final int BRONZE_POINT = 20;
        System.out.print("회원 포인트를 입력하세요 >>>");
        point = scanner.nextInt();

        if (point >= 80) {
            System.out.println("회원등급 : VIP");
        } else if (point >= 60) {
            System.out.println("회원등급 : GOLD");
        } else if (point >= 40) {
            System.out.println("회원등급 : SILVER");
        } else {
            System.out.println("회원등급 : BRONZE");
        }

        // 기능은 동일하나 개발자 친화적(=유지보수 용이)으로 재작성 예정
        // 1. sout이 너무 많다
        String userGrade = "";
        if (point > 80) {
            userGrade = "VIP";
        } else if (point > 60) {
            userGrade = "GOLD";
        } else if (point > 40) {
            userGrade = "SILVER";
        } else if (point > 20){
            userGrade = "BRONZE";
        }
        System.out.println("회원등급 : " + userGrade);
        
        // 2. 요구 등급에 대한 포인트 규정이 바뀔 경우 조건문에서 일일히 수정 필요
        String userGrade2 = "";
        if (point > VIP_POINT) {
            userGrade2 = "VIP";
        } else if (point > GOLD_POINT) {
            userGrade2 = "GOLD";
        } else if (point > SILVER_POINT) {
            userGrade2 = "SILVER";
        } else if (point > BRONZE_POINT){
            userGrade2 = "BRONZE";
        }
        System.out.println("회원등급 : " + userGrade2);
    }
}
