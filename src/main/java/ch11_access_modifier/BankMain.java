package ch11_access_modifier;

public class BankMain {
    public static void main(String[] args) {
        Bank banker1 = new Bank(123456,"홍길동",100000,1234);
        Bank banker2 = new Bank(987654,"신사임당",500000,9876);

        banker1.showAccountInfo();
        banker2.showAccountInfo();

        banker1.deposit(50000,1234);
        banker1.withdraw(200000,1234);
        banker1.withdraw(100000,1234);

        banker2.withdraw(100000,9876);
        banker2.deposit(200000,9876);

        banker1.showAccountInfo();
        banker2.showAccountInfo();

        // 잔액이 마이너스인 계좌 생성 방법
        Bank banker3 = new Bank(13579,"김사",-300000,2468);
        banker3.showAccountInfo();

        banker3.withdraw(300000,2468);
    }
}
