package test;

public class Builder1Main {
    public static void main(String[] args) {
        Builder1 builders = Builder1.builder()
                                    .name("홍길동")
                                    .age(25)
                                    .email("hong@test.com")
                                    .phone("010-1234-5647").build();
        System.out.println(builders);
    }
}
