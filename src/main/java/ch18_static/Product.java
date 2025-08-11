package ch18_static;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    // 필드 선언
    private String name;
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    // 생성자에서 count 증가 로직 추가 (필요시)
    public Product() {
        count++;
    }
}
