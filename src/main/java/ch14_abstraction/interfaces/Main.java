package ch14_abstraction.interfaces;

public class Main {
    public static void main(String[] args) {
//        PowerButton powerButton = new PowerButton();
//        ChannelDownButton channelDownButton = new ChannelDownButton();
//        ChannelUpButton channelUpButton = new ChannelUpButton();
//        TvRemoteController tvRemoteController = new TvRemoteController(powerButton,channelDownButton,channelUpButton);
//
//        powerButton.onPressed();
//        tvRemoteController.onPressedPowerButton();


        // 별개의 버튼 객체를 만듷지 않고 TvRemoteController 객체를 생성하는 방법
        TvRemoteController tvRemoteController = new TvRemoteController(
                new PowerButton(), new ChannelDownButton(), new ChannelUpButton(),
                new VolumeDownButton(), new VolumeUpButton()
        );

        tvRemoteController.onPressedPowerButton();
        tvRemoteController.onPressedChannelDownButton();
        tvRemoteController.onDownChannelDownButton();
        tvRemoteController.onPressedChannelUpButton();
        tvRemoteController.onUpChannelUpButton();
        // # String을 이용한 실행 방법
        System.out.println(tvRemoteController.onUpChannelUpButton1());

        // onPressedChannelUpButton() 메서드 / onUpChannelUpButton() 메서드를 구현하고
        // 채널 한 칸 올립니다 / 채널을 계속 올립니다 출력
        System.out.println();

        tvRemoteController.onPressedVolumeDownButton();
        tvRemoteController.onDownVolumeDownButton();
        tvRemoteController.onPressedVolumeUpButton();
        System.out.println(tvRemoteController.onUpVolumeUpButton());
        System.out.println();



        AirConditionerController airConditionerController = new AirConditionerController(
                new PowerButton(), new TemperatureUpButton(), new TemperatureDownButton(), new ModChange()
        );

        airConditionerController.onPressedPowerButton();
        airConditionerController.onPressedTemperatureUpButton();
        System.out.println(airConditionerController.onUpTemperatureUpButton());
        airConditionerController.onPressedTemperatureDownButton();
        airConditionerController.onDownTemperatureDownButton();
        airConditionerController.onPressedModChange();
        airConditionerController.onPressedModChange();
        airConditionerController.onPressedPowerButton();
    }
    /*
        VolumeDownButton / VolumeUpButton 클래스를 생성하고
        TvRemoteController의 필드에 추가하고 
        onPressedVolumeDownButton / onDownVolumeDownButton
        onPressedVolumeUpButton / onUpVolumeUpButton
        메서드를 정의하고 Main 에서
        음량을 한 칸 내립니다
        음량을 계속 내립니다
        음량을 한 칸 올립니다
        음량을 계속 올립니다
     */

}
