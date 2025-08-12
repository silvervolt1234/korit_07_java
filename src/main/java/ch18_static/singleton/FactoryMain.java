package ch18_static.singleton;

public class FactoryMain {
    public static void main(String[] args) {
        Factory factory1 = new Factory("제 1공장");
        Factory factory2 = new Factory("제 2공장");
        Factory factory3 = new Factory("제 3공장");
        Factory factory4 = new Factory("제 4공장");

        SmartPhone smartPhone1 = factory1.producSmartPhone();
        System.out.println(smartPhone1);
        SmartPhone smartPhone2 = factory2.producSmartPhone();
        System.out.println(smartPhone2);
        SmartPhone smartPhone3 = factory3.producSmartPhone();
        System.out.println(smartPhone3);
        SmartPhone smartPhone4 = factory4.producSmartPhone();
        System.out.println(smartPhone4);
        SmartPhone smartPhone5 = factory1.producSmartPhone();
        System.out.println(smartPhone5);
        /*
            이상의 코드를 실행시켰을 떄 알 수 있는 점은
            어느 공장 객체에서 메서드를 호출했든지 간에 상관없이
            createSerialNumber() 메서드를 호출한 결과가 하나로 이루어진다(싱글톤으로 인해)
            그래서 다수의 공장 객체에서 각각 produceSmartPhone() 메서드를 호출해도
            일원화된 시리얼 넘버 부여
         */
    }
}
