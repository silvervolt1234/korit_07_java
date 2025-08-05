package ch11_access_modifier;

class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

/*
    setter / getter는 default로 access modifier가 public 이므로 클래스 외부 사용 가능

    setter / getter를 이용해 처음 이름을 김일로 입려고하고 콘솔에 출력
    다시 이름을 이일로 수정하고 콘솔에 출력
 */
public class PersonMain {
    public static void main(String[] args) {
        // 객체 생성
        Person person1 = new Person();
        // person1.name = "김일";        private 이기에 대입 불가
        // System.out.println(person1.name);        역시 불가능

        person1.setName("김일");
        System.out.println(person1.getName());
        person1.setName("이일");
        System.out.println(person1.getName());
    }
}
