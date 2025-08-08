package ch14_abstraction.interfaces;

public class ChannelUpButton extends Button{

    @Override
    public void onPressed() {
        System.out.println("채널을 한 칸 올립니다.");
    }

    @Override
    public String onUp() {
        return "채널을 계속 " + super.onUp();
    }
}

// 현재까지 작성 방안에서는 채널 올리기 버튼 / 내리기 버튼 / 전원 버튼이 각각 존재
// 각각 따로 있는 버튼들을 하나로 모아주는 클래스 작성

// TvRemoteController 라는 일반 클래스 생성