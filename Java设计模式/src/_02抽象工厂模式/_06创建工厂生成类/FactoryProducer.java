package _02抽象工厂模式._06创建工厂生成类;

import _02抽象工厂模式._04抽象工厂类.AbstractFactory;
import _02抽象工厂模式._05相同接口的具体类.ColorFactory;
import _02抽象工厂模式._05相同接口的具体类.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        } else {
            return null;
        }
    }
}
