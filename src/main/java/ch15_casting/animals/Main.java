package ch15_casting.animals;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.makeSound();
        dog1.fetch();

        Animal animal1 = dog1; // 업캐스팅 # 1
        // 예시
        int a = 1;
        System.out.println(a);
        System.out.println(1);
        dog1.makeSound();
        dog1.fetch();
        animal1.makeSound();    // 결과값: 개가 짖습니다.(동물이 소리를 냅니다. x). 재정의된 메서드 호출
        // animal1.fetch();        // 불가능

        Animal animal2 =  new Dog();        // A a = new B();(시험 빈출)

        animal2.makeSound();    // 결과값: 개가 짖습니다.
        // animal2.fetch();     // 불가능

        /*
            클래스A 객체명 = new 클래스B();를 통해 객체를 생성할 경우
            1. Override가 적용된 메서드 = 자식 클래스의 메서드 호출
            2. 클래스B(자식 클래스)의 고유 메서드는 호출 불가능

            재정의된 method 버전으로 호출이 된다면
            애초에 클래스B 객체명 = new 클래스B();로 생성시
            재정의 method도 호출되고 고유 method도 호출 가능하다고 생각 가능하나 실제로는 불가능
         */

        Animal animal3 = new Animal();
        animal3.makeSound();        // 결과값: 동물이 소리를 냅니다.

        // 연산자 instanceof 사용 사례
        boolean result1 = animal1 instanceof Animal; // Animal 클래스 자료형 체크
        System.out.println(result1);        // true
        boolean result2 = animal2 instanceof Dog;
        System.out.println(result2);        // true

        // : 업캐스팅이 이루어지지 않고 그냥 Dog dog1 = new Dog();로 만든 객체 역시
        boolean result3 = dog1 instanceof Animal;
        System.out.println(result3);        // ture
        boolean result4 = animal2 instanceof Animal;
        System.out.println(result4);        // true

        // animal3의 경우 Animal animal3 = new Animal();로 생성
        boolean result5 = animal3 instanceof Animal;
        System.out.println(result5);        // true
        boolean result6 = animal3 instanceof Dog;
        System.out.println(result6);        // false

        System.out.println("업캐스팅 파트 - 객체명.메서드명(); 했을 때 재정의 버전이 나오는가 아닌가에 주목");
        System.out.println("다운캐스팅 파트");
        /*
            다운캐스팅은 명시적으로 이루어짐
            방법
            (클래스명)객체명; -> (int)2.3;과 같은 방식. conversion의 객체버전
            기본 자료형의 형뱐환을 벗어나 참조 자료형까지 고려
         */

        Dog dog2 = (Dog) animal2;   // 다운캐스팅 방법 -> Animal animal2 = new Dog();로 생성해서 dog2 객체명은 미존재
        dog2.makeSound();   // 결과값 : 개가 짖습니다.
        dog2.fetch();
        
        // 업캐스팅 : 재정의 메서드 실행용
        // 다운캐스팅 : 고유 메서드 실행용

        // dog2로 새로운 객체명을 선언하고 명시적 참조 자료형 캐스팅을 적용해
        // Animal 클래스의 인스턴스인 animal2를 DownCasting
        // 그 결과 원래 되던 재정의 버전 makeSound(); 호출은 변함이 없고
        // Dog 클래스의 고유 메서드인 fetch();도 호출 가능
        // 여전히 B b = new B();로 생성사면 문제 발생 않는 의문 발생

        // Dog dog3 = (Dog) animal3; // DownCasting 과정에서 오류 발생
        // dog3.makeSound();    // 호출도 불가능
        /*
            77번 라인에서 오류 발생
            애초에 animal3로 생성시 Animal 클래스의 생성자를 호출해서 만들어서
            (A a = new A();이기 때문에) 하위 클래스의 인스턴스로 다운캐스팅 불가능
        */
        // 해결 방안
        Animal animal4 = new Dog();
        // 형태로 선언된 클래스와 호출 생성자가 다르고 상속 관계일시에 성립

        // 에러가 드지 않을때 잘못 다운캐스팅이 이루어지는지 확인하기 위한게 instanceof 연산자

        System.out.println("animal4 검증 파트");
        if(animal4 instanceof Dog) {            // 이 조건식이 true면 animal4의 생성시 호출된 생성자는 Dog();
            Dog dog4 = (Dog) animal4;           // 92번 라인의 실행문으로 다운캐스팅을 해도 오류 x

            dog4.makeSound();
            dog4.fetch();
        }
        System.out.println("animal3는 다운캐스팅 안되기에 검증 후 시도");
        if(animal3 instanceof Dog) {
            Dog dog3 = (Dog) animal3;

            dog3.makeSound();
            dog3.fetch();
        } else {
            System.out.println("불가능한 다운캐스팅");
        }

    }
}
