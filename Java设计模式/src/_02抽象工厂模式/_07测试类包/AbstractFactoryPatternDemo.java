package _02抽象工厂模式._07测试类包;

import _02抽象工厂模式._01接口包.*;
import _02抽象工厂模式._04抽象工厂类.AbstractFactory;
import _02抽象工厂模式._06创建工厂生成类.FactoryProducer;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {

        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //get an object of Shape Circle
        Shape circle = shapeFactory.getShape("CIRCLE");

        //call draw method of Shape Circle
        circle.draw();

        //get an object of Shape Rectangle
        Shape rectangle = shapeFactory.getShape("RECTANGLE");

        //call draw method of Shape Rectangle
        rectangle.draw();

        //get an object of Shape Square
        Shape square = shapeFactory.getShape("SQUARE");

        //call draw method of Shape Square
        square.draw();

        //get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        //get an object of Color Red
        Color red = colorFactory.getColor("RED");

        //call fill method of Red
        red.fill();

        //get an object of Color Green
        Color green = colorFactory.getColor("Green");

        //call fill method of Green
        green.fill();

        //get an object of Color Blue
        Color blue = colorFactory.getColor("BLUE");

        //call fill method of Color Blue
        blue.fill();
    }
}
