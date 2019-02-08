package _11门面模式_或_外观模式._02创建实现几个相同接口的具体类;

import _11门面模式_或_外观模式._01接口包.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
