package ch09_classes.product;
/*
1. 기본 생성자를 사용하여 객체를 생성하세요
product1
productNum 123456
productName LG 엘패드

2. 시리얼 넘버를 기본으로 입력하는 매개변수 생성자를 통해 객체를 생성하시오.
product2
productNum 9876564
productName 다이소충전기

3. 제품명을 기본으로 입력하는 매개변수 생성자를 통해 객체를 생성하시오
product3
productNum 159357
productName USB-C 케이블

4. AllArgsConstructor를 이용하여 객체 생성하시오.
product4
productNum 951753
productName GFlip6

5. 정보를 출력하는 showInfo()(call1타입으로 정의할것)의 콘솔창 결과는 다음과 같습니다.

실행 예
시리얼 넘버 : 951753
제품 타이틀 : GFlip6
 */
public class Product {
    int productNum;
    String productName;

    public Product() {
        System.out.println();
        System.out.println("기본 생성자로 객체를 생성했습니다.");
    }

    public Product(int productNum) {
        this.productNum = productNum;
        System.out.println("int 매개변수 생성자로 객체를 생성했습니다.");
    }

    public Product(String productName) {
        this.productName = productName;
        System.out.println("String 매개변수 생성자로 객체를 생성했습니다.");
    }

    public Product(int productNum, String productName) {
        this.productNum = productNum;
        this.productName = productName;
        System.out.println("int, String 매개변수 생성자로 객체를 생성했습니다.");
    }

    void showInfo() {
        System.out.println("시리얼 넘버 : " + productNum);
        System.out.println("제품 타이틀 : " + productName);
        System.out.println();
    }
}
