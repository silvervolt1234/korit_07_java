package ch18_static.builders;

import lombok.ToString;

@ToString
public class Person {
    private String name;
    private int age;
    private String address;

    // 생성자를 정의하는 법은 많은데 Lombok을 도입할수도 있지만
    // 그중에서도 몇 번쨰 argument로 이름은 넣는지 나이를 넣는지는 구분 힘듬

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
    }
    /*
        PersonMain 에서 생성자 호출을 통해서 객체를 생성하는 것을 막음
        그리고 매개변수에서 Builder builder 라고 되어 있고
        그 다음 줄 builder.name을 보면 builder 객체의 필드로 name / age / address 가 있는걸로 추정
        중요한 점은 Person의 필드와 Build의 필드가 동일해야 함
     */

    public static class Builder {
        private String name;
        private int age;
        private String address;

        /*
            이하의 코드는 method 정의 영역
            대부분의 경우 method는 행위를 나타내기 때문에 동사로 시작하지만
            Builder의 경우 대입될 필드와 동일한 메서드 명 필요(필드명=명사=메서드)
         */
        public Builder name(String name) {
            this.name = name;       // 객체가 생성되면 객체 이름으로 치환되는 키워드
            return this;            // 여태까진 name에 값이 없다가 36번 라인에 name field에 값이 대입된 객체 리턴
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }
        
        // 이 위쪽 코드까지는 field 명과 동일한 메서드 정의
        // 그 효과는 메서드명과 동일한 field에 값이 대입된 Builder 객체가 리턴

        public Person build() {
            return new Person(this);        // 이 this는 Builder 클래스의 인스턴스에 해당
        }
    }
}
