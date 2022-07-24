package hello.core.order;

/**
 * 주문의 역할
 */
public interface OrderService {
    Order createOrder(Long memberId,String itemName, int itemPrice);

}
