package ch18_static.singleton.products;

public class ProductView {
    // 정적 변수 선언
    // 보통 싱글톤 패턴 생성 시 정적 변수 이름 instance -> 빈출 문제
    private static ProductView instance;    // ProductView 클래스의 정적 field인 instance
    private static int count = 1;

    // private로 생성자를 선언     -> 객체가 하나만 생성되는걸 보장하기 위한 접근 지정자이기에 중요
    private ProductView() {
        int counter = 1;      // 객체가 생성될때 만들어지는 지역 변수
        System.out.println(counter + " 번 째 객체가 생성되었습니다.");
        counter++;
        System.out.println("정적 변수를 참조하는 " + count + " 번 객첵 생성되었습니다.");
        count++;        // 위의 정적 변수. 코드 상 차이 확인
    }
    
    // static 메서드의 정의 -> 대부분 getInstance() -> 시험시 빈출. 클래스명.메서드명() 호출
    public static ProductView getInstance() {
        if(instance == null) {                  // 현재 인스턴스가 없으면 20번 코드 라인이 true이기에
            instance = new ProductView();       // ProductView() 생성자를 호출해 instance에 대입
        }
        return instance;                        // 이미 실행됬으면 바로 23번 라인 실행
    }
}
