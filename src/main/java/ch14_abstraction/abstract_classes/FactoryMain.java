package ch14_abstraction.abstract_classes;

public class FactoryMain {
    public static void main(String[] args) {
        // 추상 클래스 객체 생성을 원래는 불가능
        Factory factory1 = new Factory() {
            @Override
            public void produce(String model) {
                System.out.println(this.getName() + "에서 [ " + model + "]을 생산합니다.");
            }

            @Override
            public void manage() {
                System.out.println("스마트폰 공장을 관리합니다.");
            }
        };  // ;를 꼭 명시해야하는데 이 전체 코드라인이 메서드를 정의가 아닌 객체를 생성
        factory1.setName("가전제품공장");
        factory1.showInfo();
        /*
            이상의 개념은 익명 클래스로, Java1.1
            -> 추후 학습할 람다식(Lambda Expression)으로 대체 되는 경우 빈도 높음(JavaScript 동일)
            
            재사용하지 않고 한 번만, 즉 이 경우 FactoryMain 에서만 쓰고 치울 예정시 사용하기 편리
            
            현재는 모든 클래스를 한번만 정의하고 객체 한두개 선으로 끝나는 경우가 많아 모든 경우를 익명 클래스로 처리 가능
         */

        PhoneFactory phoneFactory1 = new PhoneFactory();
        phoneFactory1.setName("애플 스마트폰 공장");

        // 부모 클래스에서 선언한 추상 클래스를 자식 클래스에서 구현부 작성대로 작동되는지 확인
        phoneFactory1.produce("아이폰 17 에어");
        phoneFactory1.manage();
        // 부모 클래스의 일반 메서드 호출
        phoneFactory1.showInfo();

        /*
            오버라이딩 개념은 재정의를 전제로 부모 클래스와 자식 클래스의 메서드가 다르게 굴러갈때만 이루어지면 되고
            부모 클래스의 메서드를 동일하게 사용할려면 받아올 필요 없이 일반적 사용 가능

            단, 자식 클래스 정의시 부모 클래스에 특정 메서드의 존재를 명확히 인식 필요
         */
        System.out.println("----------------------------------");

        TableFactory tableFactory1 = new TableFactory() {
            @Override
            public void produce(String model) {
            }
            @Override
            public void manage() {
            }
        };
        tableFactory1.upgrade("아이패드 프로 13인치 8세대");
        tableFactory1.setName("애플 태블릿 공장");
        tableFactory1.setName("구글 태블릿 공장");
        System.out.println(tableFactory1.getName() + "으로 변경되었습니다.");
        tableFactory1.produce("구글 태블릿");
        tableFactory1.manage();
        tableFactory1.upgrade("구글 태블릿 10인치 2세대");


        System.out.println("----------------------------------");
        
        Factory factory2 = new Factory() {
            @Override
            public void produce(String model) {
                System.out.println(model + " 컴퓨터를 생산합니다.");
            }

            @Override
            public void manage() {
                System.out.println("컴퓨터 공장을 관리합니다.");
            }
        };
        factory2.setName("삼성 컴퓨터 공장");
        factory2.showInfo();

    }
}
