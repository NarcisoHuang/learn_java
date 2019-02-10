package _27实体模式._04客户端包用来使用组合实体;

import _27实体模式._03组合实体包.CompositeEntity;

public class Client {
    private CompositeEntity compositeEntity = new CompositeEntity();

    public void printData() {
        for (int i = 0; i < compositeEntity.getData().length; i++) {
            System.out.println("Data: " + compositeEntity.getData()[i]);
        }
    }

    public void setData(String data1, String data2) {
        compositeEntity.setData(data1, data2);
    }
}
