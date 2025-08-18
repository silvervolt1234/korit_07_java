package test;

import lombok.Builder;
import lombok.ToString;

@ToString
@Builder
public class Builder1 {
    private String name;
    private int age;
    private String email;
    private String phone;
}
