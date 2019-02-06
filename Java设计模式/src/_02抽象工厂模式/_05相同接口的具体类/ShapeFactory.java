package _02抽象工厂模式._05相同接口的具体类;

import _02抽象工厂模式._01接口包.*;
import _02抽象工厂模式._02具体形状包.*;
import _02抽象工厂模式._04抽象工厂类.AbstractFactory;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){

        if (shapeType == null) {
            return null;
        } else if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        } else {
            return null;
        }
    }

    @Override
    public Color getColor(String color){
        return null;
    }
}

