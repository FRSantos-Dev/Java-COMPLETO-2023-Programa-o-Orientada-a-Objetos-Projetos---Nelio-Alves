package entities;

import java.util.Date;
import entities.enums.OrderStatus;

public class Order {

    private Integer id;
    private Date momento;
    private OrderStatus status;

    public Order() {
    }

    public Order(Integer id, Date momento, OrderStatus status) {
        this.id = id;
        this.momento = momento;
        this.status = status;
    }

    

}
