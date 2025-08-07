package ch14_abstraction.interfaces;

public class TvRemoteController {
    // 필드 선언
    private PowerButton powerButton;        // 접근지정자 클래스명 객체명 -> 여태까지의 작성 방법과 다름
    private ChannelDownButton channelDownButton;
    private ChannelUpButton channelUpButton;
    private VolumeDownButton volumeDownButton;
    private VolumeUpButton volumeUpButton;

    public TvRemoteController(PowerButton powerButton,
                              ChannelDownButton channelDownButton,
                              ChannelUpButton channelUpButton,
                              VolumeDownButton volumeDownButton,
                              VolumeUpButton volumeUpButton) {
        this.powerButton = powerButton;
        this.channelDownButton = channelDownButton;
        this.channelUpButton = channelUpButton;
        this.volumeDownButton = volumeDownButton;
        this.volumeUpButton = volumeUpButton;
    }

    // 이상에서 선언한 필드(객체)의 메서드를 호출 방법
    public void onPressedPowerButton() {
        powerButton.onPressed();
    }

    public void onPressedChannelDownButton() {
        channelDownButton.onPressed();
    }

    public void onDownChannelDownButton() {
        channelDownButton.onDown();
    }

    public void onPressedChannelUpButton() {
        channelUpButton.onPressed();
    }

    // #1 String
    public String onUpChannelUpButton1() {
        return channelUpButton.onUp();      // onUp(); 결과값이 return "채널을 계속 " + super.onUp();
    }

    public void onUpChannelUpButton() {
        System.out.println(channelUpButton.onUp());
    }

    public void onPressedVolumeDownButton() {
        volumeDownButton.onPressed();
    }

    public void onDownVolumeDownButton() {
        volumeDownButton.onDown();
    }

    public void onPressedVolumeUpButton() {
        volumeUpButton.onPressed();
    }

    public String onUpVolumeUpButton() {
        return volumeUpButton.onUp();
    }

}
