package _04建造者模式._02Packing接口的具体实现类;

import _04建造者模式._01接口包.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
