package _10装饰模式._03创建实现Shape接口的抽象装饰类;

import _10装饰模式._01Shape接口包.Shape;

public class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
