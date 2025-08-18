package ch23_lambda;

public class CalculatorMain {
    // 정적 메서드 정의
    public static int operate(int a, int b, Calculator c) {
        return c.calculate(a,b);
    }
    
    public static void main(String[] args) {
        // 정의한 interface Calculator을 사용
        // 인터페이스 내부는 두 개의 매개변수만 정의되어서 추가 조작으로 사칙 연산 시도

        Calculator add =(x,y) -> x + y;     // Calculator 인터페이스의 객체명이 add고 내부 메서드는 calculate()
        Calculator sub =(x,y) -> x - y;     // Calculator 인터페이스의 객체명이 sub고 내부 메서드는 calculate()
        Calculator mul =(x,y) -> x * y;
        Calculator div =(x,y) -> x / y;

        System.out.println(add.calculate(4,2));     // 13번 라인의 주석을 참고 했을 때 올바른 메서드 호출 방식
        System.out.println(sub.calculate(4,2));     // 너무 길어서 static method 호출
        System.out.println("--- static method 호출 방식 결과 ---");
        System.out.println("2 + 3 = " + operate(2,3, add)); // static method의 로직
        // 세 번째 매개변수로 Calculator 인터페이스의 sub 클래승를 받고
        // return 문에서 해당 객체의 .calculate() 메서드 호출을 확인
        // add.calculate()는 return이 x + y니 결과값이 5
        // 그래서 Calculator 인터페이스와 CalculatorMain의 static method와 main의 lambda 식을 전부 살펴볼 필요 존재
        System.out.println("2 * 3 = " + operate(2,3, mul));
    }
}
