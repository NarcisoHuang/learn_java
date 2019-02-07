package _04建造者模式._04扩建_03创建的抽象类的具体类._02ColdDrink具体类;

import _04建造者模式._03创建抽象类实现Item接口.ColdDrink;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 20.6f;
    }
}
