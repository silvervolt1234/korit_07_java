package test.coding;

class Factory {
    private static Factory instance;
    private String factoryName;

    private Factory() {
    }

    public static Factory getInstance() {
        if (instance == null) {
            synchronized(Factory.class) {
                instance = new Factory();
            }
        }
        return instance;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }


}
public class Singleton {
    public static void main(String[] args) {
        Factory factory = Factory.getInstance();
        factory.setFactoryName("삼성 주 공장");
        System.out.println("회사명 : " + factory.getFactoryName());
    }
}