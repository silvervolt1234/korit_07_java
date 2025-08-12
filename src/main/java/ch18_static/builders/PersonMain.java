package ch18_static.builders;

public class PersonMain {
    public static void main(String[] args) {
        // 기존 객체 생성 방식
        // Person person1 = new Person();        // builder 생성시 private로 생성해서 불가능
        // 그리고 여태까지의 방식으로 안근수, 38, 부산광역시 연제구 라는 필드 값을 지니는 객체를 생성하면
        // Person person1 = new Person("안근수", 38, "부산광역시 연제구");
        // 를 빌더 패턴을 적용하면
        // 이하의 예시는 AllArgsConstructor
        Person person1 = new Person.Builder().name("안근수").age(38).address("부산광역시 연제구").build();
        System.out.println(person1);

        Person person2 = new Person.Builder().build();
        System.out.println(person2);

        Person person3 = new Person.Builder().address("서울특별시 종로구").build();
        System.out.println(person3);
    }
}
