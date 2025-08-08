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
        System.out.println("장치가 연결되었습니다.");
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
}
