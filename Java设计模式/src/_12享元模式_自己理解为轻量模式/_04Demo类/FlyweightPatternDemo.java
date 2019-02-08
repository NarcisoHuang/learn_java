package _12享元模式_自己理解为轻量模式._04Demo类;

import _12享元模式_自己理解为轻量模式._02创建一个实现Shape接口的具体类.Circle;
import _12享元模式_自己理解为轻量模式._03创建一个工厂类_根据给定的信息生成具体类的对象.ShapeFactory;

public class FlyweightPatternDemo {
    private static final String[] colors = {"red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100);
    }

    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
