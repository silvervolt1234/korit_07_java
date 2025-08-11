package ch15_casting.centralcontrol;

public class CentralControl {
    // 필드 선언
    private Power[] deviceArray;

    public CentralControl(Power[] deviceArray) {
        this.deviceArray = deviceArray;
    }
    
    // 메서드 정의
    public void addDevice(Power device) {
        // 지금 Power의 자식 클래스에 해당하는 인스턴스들을
        // deviceArray 라는 필드에 추가하기 위해
        // CentralControlMain 에서 객체 생성을 할 때
        // deviceArray의 최종 indexNumber는 고정되게 하되
        // 다 들어차있는 배열에 덮어쓰기가 일어나선 안되고(즉 기존 element를 삭제 불가)
        // 비어있는 element에 device 추가가 필요
        // 그렇기에 필요한 기능이 배열 내에 null 값이 존재하는디에 대한 체크가 필요
        int emptyIndex = checkEmpty();  // method 결과값을 변수 emptyIndex에 대입
        if(emptyIndex == -1) {
            System.out.println("더 이상 장치 연결이 불가능합니다.");
            return;         // 메서드 종료
        }
        deviceArray[emptyIndex] = device;   // private 적용이기에 method 경유
        // public 이면 main에 위 코드 집어넣기
        System.out.println(device.getClass().getSimpleName() + " 장치가 연결되었습니다.");
        /*
            .getClass() -> 클래스명을 return 하는 method + 패키지 경로 포함
            .getClass().getSimpleName() -> 클래스 명만 출력
            현재 method의 결과값을 가지고 다시 . 찍어서 그 다음 method 호출
            이상의 개념을 chaining method 라고 해서 return 값 유형을 명확히 인지해야
            다음 차레에 어떤 method 를 실행시킬지 알 수 있다
         */
    }
    
    private int checkEmpty() { // 메서드지만 private 사용. Main 에서 굳이 몇개의 전자제품 추가할지 고민 x
                               // deviceArray 라는 배열에서 비어있는 index 추출만 필요
                               // i++ 이기에 가장 빨리 만나는 null 값을 return
    for (int i = 0;  i < deviceArray.length ; i++) {
        if (deviceArray[i] == null) {
            return i;               // 배열 내부에 element가 없다면 그 주소지를 return
            }
        }
    return -1;
    /*
        Java의 index 넘버에는 음수값이 없어서(python은 존재) 실패 표현을 주로 -1로 표기
        하지만 0에 가까운 수이기에 -100이나 return 값으로 나올 수 없을만한 음수값을 지정하기도 하는데
        제일 보편적인 값이기에 인지 필요
     */
    }

    public void powerOn() {
        /*
            해당 클래스의 필드인 Power[] 배열 내에 있는 객체들은 기본적으로 Power의 서브 클래스 객체
            즉 on() / off() method를 공통적으로 지니고 Power 자료형으로 업캐스팅 되어있음
         */
        for (int i = 0 ; i < deviceArray.length; i++) {
            if(deviceArray[i] == null) {
                System.out.println("장치가 없어 전원을 켜지 않았습니다.");
                continue;   // break;는 반복문 즉시 종료하고 return;은 method를 즉시 종료하는데
                            // continue;의 경우에는 현재 반복만 종료하고 다음 반복문으로
                            // deviceArray[3] 주소지에 객체가 없어 null이 있다면
                            // 67번 라인의 조건문이 실행될텐데 "장치가 없어 전원을 켜지 않았습니다."가 출력되고
                            // deviceArray[4] 확인
            }
            deviceArray[i].on();
        }

        /*
            powerOff() 메서드를 정의하고
         */
    }
    public void powerOff() {
        for (Power device : deviceArray) {
            if (device == null) {
                System.out.println("장치가 없어 전원을 끄지 않았습니다.");
                continue;
            }
            device.off();
        }
    }
    /*
        현재 배열 내에 각 객체들이 들어가 있고 객체명 getClass().getSimpleName()을 활용시
        클래스 네임만 출력되는데 deviceArray를 반복 돌려서 몇 번 인덱스에
        어떤 클래스의 객체가 있는지 표시하는 showInfo()를 정의
        실행 예
        슬롯 [ 1 ] 번 : Computer
        슬롯 [ 2 ] 번 : LED
        ...
        슬롯 [ 10 ] 번 : Empty
     */
    public void showInfo() {
        for (int i = 0 ; i < deviceArray.length; i++) {
            if (deviceArray[i] == null) {
                System.out.println("슬롯 [ " + (i+1) + " ] 번 : Empty" );
                continue;
            }
            System.out.println("슬롯 [ " + (i+1) + " ] 번 : " + deviceArray[i].getClass().getSimpleName());
        }
    }
    // 이제 배열 내부를 돌면서 각 element 들의 고유 메서드를 실행
    // 논리적으로는 불가능

    public void performSpecificMethod() {
        for (Power device : deviceArray) {
            if (device instanceof AirConditioner) { // Power의 서브클래스가 잘못된 다운캐스팅을 하지 않게하는 조건문
                AirConditioner airConditioner = (AirConditioner)device; // 명시적 다운캐스팅
                airConditioner.changeMod();
            } else if (device instanceof Computer) {
                Computer computer = (Computer)device;
                computer.compute();
            } else if(device instanceof LED) {
                LED led = (LED)device;
                led.changeColor();
            } else if(device instanceof Mouse) {
                Mouse mouse = (Mouse) device;
                mouse.leftClick();
            } else if(device instanceof Speaker) {
                Speaker speaker = (Speaker) device;
                speaker.changeEqual();
            } else if (device instanceof Printer) {
                Printer printer = (Printer) device;
                printer.print();
            } else if (device == null) {
                System.out.println("장치가 비어있습니다.");
            } else {                        // instanceof 연산자를 통해서 조건문을 추가하지 못한 class 및
                                            // 추후 update를 통해 다른 기기들을 지원할 때는 } else 사이에 else if 문 추가
                System.out.println("지원하지 않는 기기입니다.");
            }
        }
    }
    
    // Printer 클래스를 정의하고 Power interface 를 implement 한 후
    // 고유 메서드로 print() -> 프린터가 인쇄를 합니다 를 출력하게 정의
    // Main 에서 printer1을 centralControl에 추가, on() / off()를 실행 후
    // print() 메서드로 centralControl를 통해 실행
}
