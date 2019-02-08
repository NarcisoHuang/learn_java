package _14命令模式._03创建实现Order接口的具体类;

import _14命令模式._01接口包.Order;
import _14命令模式._02创建一个请求对象.Stock;

public class SellStock implements Order {

    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void execute() {
        stock.sell();
    }
}
