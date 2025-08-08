package ch09_classes;
/*
    Car의 인스턴스인 myCar 라는 객체를 생성하시오
    color에 빨강 대입, 스피드에 160 대입
    yourCar 객체 생성
    color에 노랑 대입, speed 180 대입
    myCar는 drive() 메서드 호출
    yourCar는 brake() 메서드 호출
    myCar, yourCar에 각각 displayInfo() 메서드 호출
     */
public class CarMain {
    public static void main(String[] args) {

        // 객체 생성 방법
        // 클래스명 객체명 = new 클래스명();

        // 객체에 값 대입 방법
        // 객체명.속성몀 = 데이터;

        // 객체의 메서드 호출 방법
        // 객체명.메서드명();

        Car myCar = new Car();
        myCar.color = "빨강";
        myCar.speed = 160;

        Car yourCar = new Car();
        yourCar.color = "노랑";
        yourCar.speed = 180;

        myCar.drive();
        yourCar.brake();
        System.out.println();

        myCar.displayInfo();
        System.out.println();
        yourCar.displayInfo();

    }
}
