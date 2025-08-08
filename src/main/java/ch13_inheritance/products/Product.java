package ch13_inheritance.products;
/*
    super 키워드
        1. super();             -> 부모 생성자를 호출
        2. super.메서드명();      -> 부모 클래스의 메서드 호출


    부모-자식의 상속관계가 성립되어 있을 때
    부모 클래스에서 기본 생성자 없이 매개변수 생성자만 있다면
    자식 클래스에서 완벽한 기본 생성자를 생성 불가능

    자식 클래스의 객체 생성시 필수적으로 부모 클래스의 생성자를 호출하기 때문

    // 어떤 객체를 생성한다고 가정 시
    A a = new B();
    같은 형태의 객체 생성 방식이 튀어 나옴(이상 정보처리기사 단골 문제)
 */
public class Product extends Item{
    // 자식 고유의 field 정의
    private int price;
    private int stock;

    // 부모생성자를 호출한건데 Product 클래스의 AllArgsConstructor를 원함
    public Product(String name, String category, int price, int stock) {
        super(name, category);
        this.price = price;
        this.stock = stock;
    }

    // 자식 고유의 field에 대한 getter / setter 정의
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // 자동 완선 아닌 고유 메서드 임의 정의
    public void showInfo() {
        System.out.println("제품명 : " + this.getName());           // 부모거라서 getter 조회
        System.out.println("카테고리 : " + this.getCategory());
        System.out.println("가격 : " + price);                     // 자식거라서 field 조회
        System.out.println("재고 : " + stock);                     // 두 줄씩 코드라인의 차이가 생기는 이유에 대해 명확히 알기
    }
}
