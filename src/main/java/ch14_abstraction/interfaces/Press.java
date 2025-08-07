package ch14_abstraction.interfaces;

public interface Press {
    String NAME = "button";
    /*
        interface 이기 때문에 변수 앞에 접근 지정자를 명시하지 않고 final 키워드도 적지 않지만
        public final이 생략. 그래서 String 앞에 final을 명시해도 불필요하다는 알림 발생
     */
    // 불가능한 예시들
    // String age;      // field(인스턴스 변수) 선언 불가능
    // public Press(){};    // 생성자 불가능
    // void popOut() {
    //     System.out.println("추상 메서드 x / 일반 메서드 케이스");
    // }

    // 가능한 예시
    void onPressed();

    // 이미 생성된 Up interface에 onUp()이라는 메서드에 추상 메서드를 정의(call1())
    // Down interface를 생성하고 onDown()이라는 추상 메서드를 정의(call1())


}
