package ch18_static.singleton;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Factory {
    // 필드 정의
    private String factoryName;

    // 메서드 정의
    public SmartPhone producSmartPhone() {
        System.out.println(factoryName + "에 스마트폰을 생성합니다.");
        // 접근 지정자가 없기에 default. 그리고 { } 내에 있으니 지역변수
        String model = "갤럭시 S26";
        String serial = null;

        Samsung samsung = Samsung.getInstance();
        // Samsung 객체를 생성 -> 싱글톤 써서 동일 객체 계속 대입

        serial = samsung.createSerialNumber(model);
        // 지금 현재 리턴 타입이 SmartPhone. 그러면 SmartPhone 객체가 나와야 함
        // 스마트폰 객체를 쓰기 위해서는

        SmartPhone smartPhone = new SmartPhone(samsung.getCompany(), model, serial);
        return smartPhone;
    }
}
