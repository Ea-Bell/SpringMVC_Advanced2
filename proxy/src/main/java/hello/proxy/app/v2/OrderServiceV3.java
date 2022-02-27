package hello.proxy.app.v2;

public class OrderServiceV3 {

    private  final OrderRepositoryV3 orderRepositoryV2;

    public OrderServiceV3(OrderRepositoryV3 orderRepositoryV2) {
        this.orderRepositoryV2 = orderRepositoryV2;
    }

    public void orderItem(String itemId) {
        orderRepositoryV2.save(itemId);
    }
}