package ch14_abstraction.interfaces;
/*
    클래스는 단일 상속만 가능. 키워드는 -> extends
    인터페이스는 다중 상속이 가능. 키워드는 implements
 */
public abstract class Button implements Press, Up, Down{
    @Override
    public void onDown() {

    }       // 일반 메서드지만 본문에 아무것도 X

    @Override
    public abstract void onPressed();

    @Override
    public String onUp() {
        return "올립니다.";
    }
}
/*
    ChannelDownButton / ChannelUpButton 생성 후 Button을 상속
    상속 받으면 에러뜨는건 자동 오류 처리
 */
