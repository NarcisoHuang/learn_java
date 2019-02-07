package _05原型模式._02创建_1内的抽象类的具体实现类;

import _05原型模式._01实现Clonable接口的抽象类.Shape;

public class Rectangle extends Shape {

    /**
     * 设置Shape类的type值为Rectangle
     */
    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }


}
