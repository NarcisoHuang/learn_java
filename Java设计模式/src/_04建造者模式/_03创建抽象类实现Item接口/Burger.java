package _04建造者模式._03创建抽象类实现Item接口;

import _04建造者模式._01接口包.Item;
import _04建造者模式._01接口包.Packing;
import _04建造者模式._02Packing接口的具体实现类.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
