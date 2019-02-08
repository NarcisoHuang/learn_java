package _14命令模式._04创建命令调用程序类;

import _14命令模式._01接口包.Order;

import java.util.ArrayList;
import java.util.List;

public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order :
                orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
