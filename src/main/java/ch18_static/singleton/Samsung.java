package ch18_static.singleton;

import lombok.Getter;
/*
    ProductView와 인터넷에서의 레퍼런스로 Samsung 클래스의 싱글톤 패턴 작성
 */
public class Samsung {
    // 정적 필드
    private static Samsung instance;
    // 일반 필드(멤버 변수라는 표현을 쓰기도 함)
    @Getter         // getCompany()만 만들기
    private String company;
    private int serialNumber;

    // private로 NoArgsConstructor 정의
    private Samsung() {
        company = getClass().getSimpleName();       // 결과값 : Samsung
        serialNumber = 20250000;                    // 객체 생성시에 필드값 초기화
    }

    public static Samsung getInstance() {
        if(instance == null) {
            instance = new Samsung();
        }
        return instance;
    }

    public String createSerialNumber(String model) {
        return model + "_" + serialNumber;      // 싱글톤을 작성됬으니 객체 하나만 생성
        // Main 단계에서 다수이 객체에서 createSerialNumber()를 호출해도 전혀 serialNumber가 중복되지 않는다
        // 그래서 정적 변수로 선언하고 다수의 삼성 객체를 만들어도 serialNumber 중복 문제 개수에 불문하고 없음
    }
}
