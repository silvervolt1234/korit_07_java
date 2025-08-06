package ch13_inheritance;
/*
    Animal 클래스를 상속 받고
    생성자 및 getter / setter를 사용해
    Animal 클래스의 move() 메서드를 오버라이딩해
    "사람이 두 발로 걷습니다." 만 출력하게 재정의

    Main 에서 human1 객체를 생성(기본 생성자 사영)
    setter로 이름과 나이 입력
    getter로
    "안녕하세요, 제 이름은 서문성이고 나이는 22살입니다.
    내년에는 23살이 됩니다." 를 출력

    또한 Human 클래스의 고유 메서드인 read('자바의 기초')를 정의하여
    콘솔에 다음과 같이 출력될 수 있도록 작성

    실행 예
    사람 객체가 생성되었습니다
    사람이 두 발로 걷습니다
    안녕하세요, 제 이름은 서문성이고 나이는 22살입니다.
    내년에는 23살이 됩니다.
    서문성이 자바의 기초를 읽는 중 입니다.
 */
public class Human extends Animal{

    public Human() {
        System.out.println("사람 객체가 생성되었습니다.");
    }

    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    @Override
    public String getAnimalName() {
        return super.getAnimalName();
    }

    @Override
    public int getAnimalAge() {
        return super.getAnimalAge();
    }

    @Override
    public void setAnimalName(String animalName) {
        super.setAnimalName(animalName);
    }

    @Override
    public void setAnimalAge(int animalAge) {
        super.setAnimalAge(animalAge);
    }

    public void introduce(String humanName, int humanAge) {
        System.out.println("안녕하세요. 저는 " + humanName + "이고 나이는 " + humanAge + "살입니다.");
        System.out.println("내년에는 " + (humanAge+1) + "살이 됩니다.");
    }

    public void read(String book) {
        System.out.println(getAnimalName() + "이 " + book + "를 읽는 중입니다");
    }
}
