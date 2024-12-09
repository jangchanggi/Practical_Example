package jpabook.jpashop;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;

@Entity
public class OrderItem {

    @Id @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "ORDER_ID")
    private Order order;
//    @Column(name = "ORDER_ID")
//    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    private Item item;
//    @Column(name = "ITEM_ID")
//    private Long item_Id;
    private int orderPrice;

    private int itemId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
