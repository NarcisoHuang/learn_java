package _14命令模式._05使用Broker类来接收和执行命令;

import _14命令模式._02创建一个请求对象.Stock;
import _14命令模式._03创建实现Order接口的具体类.BuyStock;
import _14命令模式._03创建实现Order接口的具体类.SellStock;
import _14命令模式._04创建命令调用程序类.Broker;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock stock = new Stock();

        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrders();

    }
}
