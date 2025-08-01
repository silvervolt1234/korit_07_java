package ch09_classes;
/*
    생성자(Constructor)
        생성자는 객체가 생성될 때 호출되는 특별한 '메서드'

    객체 생성 예시
    클래스명        객체명 = new 클래스명();
    ClassExample example = new ClassExample;
    : ClassExample() -> 생성자에 해당

    특징 :
        1. 클래스의 이름과 생성자의 이름은 동일
            (다른 메서드들과 달리 대문자로 시작)
        2. return 값이 없다 -> 즉, call1() / call2() 유형으로 간주
        3. 객체 초기화 : 생성자는 객체의 필드 '초기화'를 담당

    생성자의 정의 방식
        1. 기본 생성자 : 매개변수가 없는 생성자
            (클래스를 만들 때 default로 생성되는 형태로 정의하지 않아도 될 때 존재)
            그래서 ClassA. Car 에서 기본 생성자를 정의하지 않고
            ClassMain, CarMain 에서 객체를 생성
                정확히는 default로 생성된 기본 생성자를 Main 에서 호출
                호출 결과 -> 객체 생성
        2. 매개변수 생성자 : 하나 이상의 매개 변수를 가지는 생성자

 */
public class Constructor {
    // 필드 선언
    int num;
    String name;
    
    // 기본 생성자 정의 -> 원래 기본적으로 생성
    // 그리고 매개변수의 유무만 있고 return이 없어서 call1() / call2() 유형이기에
    // 기본 생성자는 call1() 유형에 해당하고 클래스명과 동일
    Constructor() {
        System.out.println("NoArgsConstructor(기본생성자)");
    }

    // 매개변수 생성자 정의 -> 기본적으로 만들어지지 않아 사용자가 정의 필요
    // 하지만 매개변수 생성자가 하나라도 만들어지면 default 값
    // 때문에 기본 생성자와 매개변수 생성자를 두 다 사용할려면
    // 기본 생성자도 따로 '명시적 정의' 필요
    Constructor(int number) {
        System.out.println("RequiredArgsConstructor(int 매개변수를 필수로 요구하는 생성자)");
        this.num = number; // this : 해당 클래스에서 객체를 생성하면 객체 이름으로 대체
    }

    // String title을 매개변수로 하는 생성자를 정의하고
    // RequiredArgsConstructor(String 매개변수를 필수로 요구하는 생성자) 라는 안내문을 출력하고
    // ConstructorMain 으로 가서 constructor3이라는 객체명을 지니고 "내 이름"으로 객체를 생성 후
    // System.out.println(constructor3.name); 을 입력해 콘솔에 내 이름을 출력

    Constructor(String name) {
        System.out.println("RequiredArgsConstructor(String 매개변수를 필수로 요구하는 생성자)");
        this.name = name;
    }
}
