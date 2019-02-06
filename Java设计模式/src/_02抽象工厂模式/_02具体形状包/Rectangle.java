package _02抽象工厂模式._02具体形状包;

import _02抽象工厂模式._01接口包.Shape;

/**
 * 矩形类, 继承了_02抽象工厂模式.intefacePackage包中的接口类Shape
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
