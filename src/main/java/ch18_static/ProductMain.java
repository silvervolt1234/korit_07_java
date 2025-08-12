package ch18_static;

public class ProductMain {
    public static void main(String[] args) {
        // static 메서드이 호출른 객체 생성 필요 없음
        // 객체 생성 전
//        System.out.println(Product.getTitle());

//        Product product1 = new Product();
//        product1.setName("아이스 아메리카노");
//        System.out.println(product1.getName());
//        System.out.println(Product.getCount());

        System.out.println(Product.getCount());

        Product product1 = new Product();
        System.out.println("일반 필드 조회 : " + product1.getInstanceCount());
        System.out.println("정적 필드 조회 : " + Product.getCount());

        Product product2 = new Product();
        System.out.println("일반 필드 조회 : " + product2.getInstanceCount());
        System.out.println("정적 필드 조회 : " + Product.getCount());

        Product product3 = new Product();
        System.out.println("일반 필드 조회 : " + product3.getInstanceCount());
        System.out.println("정적 필드 조회 : " + Product.getCount());
    }
}
