package ch11_access_modifier;

import java.util.Scanner;

public class BankMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 계좌 1 생성
        System.out.println("=== 첫 번째 계좌 생성 ===");
        System.out.print("계좌 번호 입력: ");
        int accNum1 = scanner.nextInt();
        scanner.nextLine(); // 버퍼 정리

        System.out.print("예금주 이름 입력: ");
        String name1 = scanner.nextLine();

        System.out.print("초기 잔액 입력: ");
        int balance1 = scanner.nextInt();

        System.out.print("4자리 비밀번호 입력: ");
        int pin1 = scanner.nextInt();

        Bank banker1 = new Bank(accNum1, name1, balance1, pin1);

        // 계좌 2 생성
        System.out.println("\n=== 두 번째 계좌 생성 ===");
        System.out.print("계좌 번호 입력: ");
        int accNum2 = scanner.nextInt();
        scanner.nextLine(); // 버퍼 정리

        System.out.print("예금주 이름 입력: ");
        String name2 = scanner.nextLine();

        System.out.print("초기 잔액 입력: ");
        int balance2 = scanner.nextInt();

        System.out.print("4자리 비밀번호 입력: ");
        int pin2 = scanner.nextInt();

        Bank banker2 = new Bank(accNum2, name2, balance2, pin2);

        // 초기 계좌 정보 출력
        System.out.println("\n=== 초기 계좌 정보 ===");
        banker1.showAccountInfo();
        banker2.showAccountInfo();

        // 입출금 처리
        System.out.println("\n=== banker1 입금 처리 ===");
        System.out.print("입금 금액: ");
        int deposit1 = scanner.nextInt();
        System.out.print("비밀번호 입력: ");
        int depositPin1 = scanner.nextInt();
        banker1.deposit(deposit1, depositPin1);

        System.out.println("\n=== banker1 출금 시도 (1) ===");
        System.out.print("출금 금액: ");
        int withdraw1 = scanner.nextInt();
        System.out.print("비밀번호 입력: ");
        int withdrawPin1 = scanner.nextInt();
        banker1.withdraw(withdraw1, withdrawPin1);

        System.out.println("\n=== banker1 출금 시도 (2) ===");
        System.out.print("출금 금액: ");
        int withdraw2 = scanner.nextInt();
        System.out.print("비밀번호 입력: ");
        int withdrawPin2 = scanner.nextInt();
        banker1.withdraw(withdraw2, withdrawPin2);

        System.out.println("\n=== banker2 출금 처리 ===");
        System.out.print("출금 금액: ");
        int withdraw3 = scanner.nextInt();
        System.out.print("비밀번호 입력: ");
        int withdrawPin3 = scanner.nextInt();
        banker2.withdraw(withdraw3, withdrawPin3);

        System.out.println("\n=== banker2 입금 처리 ===");
        System.out.print("입금 금액: ");
        int deposit2 = scanner.nextInt();
        System.out.print("비밀번호 입력: ");
        int depositPin2 = scanner.nextInt();
        banker2.deposit(deposit2, depositPin2);

        // 최종 계좌 정보 출력
        System.out.println("\n=== 최종 계좌 정보 ===");
        banker1.showAccountInfo();
        banker2.showAccountInfo();

        scanner.close();
    }
}
