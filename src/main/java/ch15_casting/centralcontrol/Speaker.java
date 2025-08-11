package ch15_casting.centralcontrol;

public class Speaker implements Power{
    @Override
    public void on() {
        System.out.println("스피커의 전원을 켭니다.");
    }

    @Override
    public void off() {
        System.out.println("스피커의 전원을 끕니다.");
    }

    public void changeEqual() {
        System.out.println("스피커의 이퀄라이저를 변경합니다.");
    }
}

// CentralControl 클래스를 생성

// 20250811 수업 시
/*
    각 클래스들에 고유 메서드들을 정의
    현재 Power를 implement 한 객체즐은 업캐스팅이 이루어진채로
    Power의 field인 deviceArray에 포함

    현재 상황해서는 고유메서드 실행 방식을 점검
 */
