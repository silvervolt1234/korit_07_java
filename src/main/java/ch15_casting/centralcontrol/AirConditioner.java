package ch15_casting.centralcontrol;

public class AirConditioner implements Power{
    @Override
    public void on() {
        System.out.println("에어컨의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("에어컨의 전원을 끕니다.");
    }

    // DownCasting 이전 고유 메서드들 정의
    public void changeMod() {
        System.out.println("에어컨 모드를 바꿨습니다.");
    }
}
