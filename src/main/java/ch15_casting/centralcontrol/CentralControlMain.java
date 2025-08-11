package ch15_casting.centralcontrol;

public class CentralControlMain {
    public static void main(String[] args) {
        // 각 클래스의 객체 생성
        Computer computer1 = new Computer();
        AirConditioner airConditioner1 = new AirConditioner();
        Speaker speaker1 = new Speaker();
        Mouse mouse1 = new Mouse();
        LED led1 = new LED();
        Printer printer1 = new Printer();
        // 참조자료형의 배열을 생성(빈거)
        // Power[] powers = new Power[5];
        // 이하의 코드는 powers 생성하며 indexNumber가 고정되서 ex)
        // Power[] powers = {new Computer(), new AirConditioner(), new Speaker()};
        
        // centralControl 객체를 만들어 내부의 필드에 비어있는 Power[] 배열을 생성
        CentralControl centralControl = new CentralControl(new Power[10]);

        centralControl.addDevice(computer1);        // 여기서 (암시적) 업캐스팅 발생
        centralControl.addDevice(airConditioner1);
        centralControl.addDevice(speaker1);
        centralControl.addDevice(speaker1);
        centralControl.addDevice(speaker1);

        /*
            Mouse / LED 클래스를 정의하고 on() / off() 메서드를
            implement 하고 CentralControlMain 에서 각 객체를 생성하고
            CentralControl 객체에 넣기
         */
        centralControl.addDevice(mouse1);
        centralControl.addDevice(led1);
        centralControl.addDevice(printer1);
        System.out.println("-----------------------------");
        centralControl.powerOn();
        System.out.println("-----------------------------");
        centralControl.powerOff();
        System.out.println("-----------------------------");

//        System.out.println("------continue------");
//        for (int i = 0; i < 10 ; i++) {
//            System.out.print((i+1) + " ");
//        }
//        System.out.println();
//        System.out.println("------continue------");
//        for (int i = 0; i < 10 ; i++) {
//            if((i+1) % 2 == 1) {
//                System.out.print(i + " ");
//            }
//        }
//        System.out.println();
//        System.out.println("------continue------");
//        for (int i = 0; i < 10 ; i++) {
//            if((i+1) % 2 == 1) {
//                continue;                           // 해당 반복을 종료하고 다음 반복 실행
//            }
//            System.out.print(i + " ");
//        }
        centralControl.showInfo();
        System.out.println("-----------------------------");
        speaker1.changeEqual();
        System.out.println("-----------------------------");
        centralControl.performSpecificMethod();
    }
}
