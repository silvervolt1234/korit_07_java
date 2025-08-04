package ch10_getter_setter;

public class PersonMain {
    public static void main(String[] args) {
        // 객체 생성
        Person person1 = new Person();
        Person person2 = new Person("김이");
        Person person3 = new Person(20);
        Person person4 = new Person("김사", 54);

        // 비어있는 필드에 값 대입
        person1.name = "김일";
        person1.age = -10;
        person2.age = 201;
        person3.name = "김삼";

        // 적절하지 않은 데이터 확인
        System.out.println(person1.age);
        System.out.println(person2.age);
        
        // Getter / Setter의 사용법 -> method 라고 정의
        // 즉 메서드 호출 방법 사용
        // person1의 이름을 디카프리오
        System.out.println(person1.getName());
        System.out.println(person1.name);
        person1.setName("디카프리오");
        person1.name = "김일";
        person1.name = "디카프리오";
        System.out.println(person1.getName());
        System.out.println(person1.name);
        // Getter / Setter를 통해서만 데이터의 입력 / 수정 / 조회를 가능하게 하고
        // 필드에 직접 값 대입 장식을 막기

        person4.setAge(789);                // 결과값 : 불가능한 나이 입력입니다
        System.out.println(person4.age);    // 결과값 : 54 -> 기존 나이 출력
        person4.age = 789;                  // 필드에 직접 값을 대입
        System.out.println(person4.age);    // 결과값 : 789
        
        // 이상과 같은 코드 라인은 특정 방법을 사용시 부정확한 데이터의 입력 가능하기에
        // 장기적으로는 method를 활용한 데이터의 입력 / 수정 / 조회가 필요

        // .length() -> String 자료형의 글자 수를 return 하는 method -> 글자수니 return 자료형은 int
        System.out.println(person1.name.length());      // 이상의 객체명.메서드명().메서드명()
        // . . 이 여러개 나오는 방식을 chaining
        // 중간 과정에 변수 선언도 가능
        String person1SName = person1.name;
        System.out.println(person1SName.length());

        person1.setName("노마드코더");
        person1.setName("이일");
    }
}
