package _07桥接模式._05Shape和DrawAPI类的实现Demo类;

import _07桥接模式._02DrawAPI接口具体实现类.GreenCircle;
import _07桥接模式._02DrawAPI接口具体实现类.RedCircle;
import _07桥接模式._03使用DrawAPI接口创建抽象类Shape.Shape;
import _07桥接模式._04创建实现Shape接口的具体类.Circle;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(10,100,100, new RedCircle());
        Shape greenCircle = new Circle(10, 100, 100, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
