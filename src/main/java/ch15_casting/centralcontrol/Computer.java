package ch15_casting.centralcontrol;

public class Computer implements Power{
    @Override
    public void on() {
        System.out.println("컴퓨터의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("컴퓨터의 전원을 끕니다.");
    }
}
/*
    프로그램 구현 사항
    interface Power를 implement한 다양한 클래스 정의
    ex) Computer / AirConditioner / Speaker 들이
    전부 Power를 implement 하면 이사의 세 클래스들은 강제적으로
    on() / off() 메서드들을 override 필요

    그래서 Computer / AirConditioner / Speaker 객체들을
    전부 Power로 업캐스팅한다면
    Computer / AirConditioner / Speaker 객체의 원래 클래스와 상관없이
    Power 클랫의 조작만으로 on() / off() 메서드 호출이 가능

    즉 B b = new B();로 애초에 객체를 생성하면 안되냐는 건
    A의 자식 클래스가 B 하나일 경우만 적용
    A의 자식클래스가 B C D E F... 등 여러개일 경우
    그것을 업캐스팅하면 A가 가지고 있는 부모 메서드를 호출해
    다수의 서로 다른 클래스의 객체를 통제할 수 있다는 장점으로 업캐스팅 적용
    그리고 다운캐스팅을 해 각각의 클래스에서 고유 메서드 실행 가능
    
    AirConditioner 클래스릉 생성해 Power implement 이후 
    에어컨의 전원을 켭니다.
    에어컨의 전원을 끕니다.
    를 재정의. Speaker 역시 실행
 */
