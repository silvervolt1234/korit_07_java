package test.coding;

public class Builder {

class Order {
    private int orderId;
    private String productName;
    private String consumerName;
    private int price;
    private int stock;

    public Order() {
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void showOrderShowInfo() {
        System.out.println("주문번호: " + orderId +
                           "\n상품명: " + productName +
                           "\n구매자: " + consumerName +
                           "\n가격: " + price +
                           "\n수량: " + stock);
    }
}

    public static void main(String[] args) {
        Builder builder = new Builder();
        Order order = builder.new Order();
        order.setOrderId(100);
        order.setProductName("Samsung GalaxyBook2 Pro");
        order.setConsumerName("홍길동");
        order.setPrice(1450000);
        order.setStock(2);
        order.showOrderShowInfo();
    }
}
