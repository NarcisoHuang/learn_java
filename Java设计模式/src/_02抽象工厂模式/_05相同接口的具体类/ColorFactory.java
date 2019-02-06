package _02抽象工厂模式._05相同接口的具体类;

import _02抽象工厂模式._01接口包.*;
import _02抽象工厂模式._03具体颜色包.*;
import _02抽象工厂模式._04抽象工厂类.AbstractFactory;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String color){

        if (color == null){
            return null;
        } else if (color.equalsIgnoreCase("RED")){
            return new Red();
        } else if (color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        } else {
            return null;
        }
    }

}
