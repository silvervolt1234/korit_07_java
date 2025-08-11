package ch17_bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@ToString(exclude = "password")
@Getter  // 여기에 애너터이션을 달면 class level
public class UserEntityLombok {
    // 여기에 달면 field level
    private int username;
    @Setter
    private int password;
    private String email;
    private String name;
}
