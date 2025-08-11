package ch17_bean;

import lombok.Getter;
/*
    정보를 담는 객체가 Entity class
    -> 데이터베이스와 연결되는 클래스만 지칭하기 때문에특별한 지위에 위치
        1열       2열         3열        4열        -> 세로줄(열/Column)
    +----------------------------------------+
    | username | password | email     | name |    -> 컬럼명 / Header
    ------------------------------------------
    |    1      | 1234    | a@test.com| 서문성|    -> 가로줄(행/Row)
    +----------------------------------------+
 */
// @Entity -> SpringBoot 설치 시 사용
@Getter
public class UserEntity {
    private int username;
    private int password;
    private String email;
    private String name;

    // 기본 생성자로 user1 객체를 생성하고 method 정의 후
    // username / 1
    // password / 9876
    // email / a@test.com
    // name / 서문성
    // 을 입력하고 toString()을 통해 다음값을 출력

    /*
        실행 예
        username : 1
        email : a@test.com
        name : 서문성
        비밀번호는 보안상 제공하지 않습니다.
     */

    public UserEntity() {
    }

    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "username : " + username + "\nemail : " + email + "\nname : " + name + "\n비밀번호는 보안 상 제공하지 않습니다.";
    }
}
