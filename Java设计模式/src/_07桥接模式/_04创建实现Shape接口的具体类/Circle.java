package _07桥接模式._04创建实现Shape接口的具体类;

import _07桥接模式._01接口包.DrawAPI;
import _07桥接模式._03使用DrawAPI接口创建抽象类Shape.Shape;

public class Circle extends Shape {
    private int x, y, radius;
    public Circle(int radius, int x, int y, DrawAPI drawAPI) {
        super(drawAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
