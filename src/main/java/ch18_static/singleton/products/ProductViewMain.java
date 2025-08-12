package ch18_static.singleton.products;

public class ProductViewMain {
    public static void main(String[] args) {
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();
        ProductView.getInstance();

        // 이상의 코드는 ProductView.java를 확인했을 때 객체를 생성하는 method
        // 생성자를 호출하지 않는 것은 생성자가 private
        // 하지만 이사으이 코드를 실행하면 1번째 객체가 생성되었습니다 한줄만 출력
        /*
            그러나 이전 static은 1, 2, 3, 4, 5 번째 객체가 생성되었습니다
            를 출력했는데 생성자 내의 지역변수로 int counter를 선언하고 초기화했기 때문

            따라서 static 패키지 내부의 코드와 ProductView를 대조 확인
         */
    }
}
