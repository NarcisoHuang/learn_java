package _07桥接模式._03使用DrawAPI接口创建抽象类Shape;

import _07桥接模式._01接口包.DrawAPI;

public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
