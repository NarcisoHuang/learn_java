package _05原型模式._02创建_1内的抽象类的具体实现类;

import _05原型模式._01实现Clonable接口的抽象类.Shape;

public class Circle extends Shape {

    /**
     * 设置Shape类的type值为Circle
     */
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }

}
