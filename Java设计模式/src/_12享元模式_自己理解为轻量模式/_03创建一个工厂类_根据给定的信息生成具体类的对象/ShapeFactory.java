package _12享元模式_自己理解为轻量模式._03创建一个工厂类_根据给定的信息生成具体类的对象;

import _12享元模式_自己理解为轻量模式._01接口包.Shape;
import _12享元模式_自己理解为轻量模式._02创建一个实现Shape接口的具体类.Circle;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }

        return circle;
    }
}
