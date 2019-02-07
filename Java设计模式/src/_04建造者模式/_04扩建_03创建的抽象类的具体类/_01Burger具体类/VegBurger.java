package _04建造者模式._04扩建_03创建的抽象类的具体类._01Burger具体类;

import _04建造者模式._03创建抽象类实现Item接口.Burger;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
