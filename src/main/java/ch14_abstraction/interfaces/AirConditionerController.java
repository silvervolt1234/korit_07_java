package ch14_abstraction.interfaces;
/*
    PowerButton 포함
    TemperatureDownButton,
    TemperatureUpButton,
    ModeChange -> 버튼 한번 누를때마다 냉방 <-> 난방
        : Press 버튼을 활용해 한번 누르면 다음 모드로 이동(PowerButton 로직으로 메서드 작성)
    AllArgsConstructor를 정의하고

    실행 예
    에어컨 리모컨 객체가 생성되었습니다.
    전원을 켭니다.
    온도를 한 칸 내립니다.
    온도를 계속 내립니다.
    온도를 한 칸 올립니다.
    온도를 계속 올립니다.
    난방으로 바뀝니다.
    냉방으로 바뀝니다.
    전원을 끕니다.
 */
public class AirConditionerController {
    private PowerButton powerButton;        // 접근지정자 클래스명 객체명
    private TemperatureDownButton temperatureDownButton;
    private TemperatureUpButton temperatureUpButton;
    private ModChange modChange;


    public AirConditionerController(PowerButton powerButton,
                                    TemperatureUpButton temperatureUpButton,
                                    TemperatureDownButton temperatureDownButton,
                                    ModChange modChange) {
        this.powerButton = powerButton;
        this.temperatureUpButton = temperatureUpButton;
        this.temperatureDownButton = temperatureDownButton;
        this.modChange = modChange;
        System.out.println("에어컨 리모컨 객체가 생성되었습니다.");

    }

    public void onPressedPowerButton() {
        powerButton.onPressed();
    }

    public void onPressedTemperatureUpButton() {
        temperatureUpButton.onPressed();
    }

    // #1 String
    public String onUpTemperatureUpButton() {
        return temperatureUpButton.onUp();      // onUp(); 결과값이 return "채널을 계속 " + super.onUp();
    }

    public void onPressedTemperatureDownButton() {
        temperatureDownButton.onPressed();
    }

    public void onDownTemperatureDownButton() {
        temperatureDownButton.onDown();
    }

    public void onPressedModChange() {
        modChange.onPressed();
    }
}
