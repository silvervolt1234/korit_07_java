package ch18_static.singleton;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class SmartPhone {
    // 필드 정의
    private String Company;
    private String model;
    public String serial;
}
