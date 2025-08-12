package ch18_static.builders;

public class PersonLombokMain {
    public static void main(String[] args) {
        PersonLombok person1 = PersonLombok.builder()
                .name("서문성")
                .age(22)
                .address("부산광역시 금정구")
                .build();
        System.out.println(person1);

        PersonLombok person2 = PersonLombok.builder()
                .name("김이")
                .build();
        System.out.println(person2);
    }
}
