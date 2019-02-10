package _27实体模式._05Demo包;

import _27实体模式._04客户端包用来使用组合实体.Client;

public class CompositeEntityPatternDemo {
    public static void main(String[] args) {

        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();

        System.out.println("==========");

        client.setData("Second Test", "Data1");
        client.printData();
    }
}
