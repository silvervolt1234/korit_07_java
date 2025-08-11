package ch16_objects;

public class ObjectTest {
    // 필드 선언
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ObjectTest() {
    }

    public void showInfo() {
        System.out.println("이름 : " + name + "\n주소 : " + address);
    }

    // 기본 생성자 / AllArgsConstructor를 정의

    // getter / setter 를 정의

    // showInfo()를 call1() 형식으로 정의
    /*
        실행 예
        이름 : 안근수
        주소 : 부산 광역시 금정구

        Main 에서 objectTest1에 이름 서문성 주소 부산광역시 금정구를 set 하고 showInfo() 호출
     */

    @Override
    public String toString() {
        return "이름 : " + name + "\n주소 : " + address;
    }
}
