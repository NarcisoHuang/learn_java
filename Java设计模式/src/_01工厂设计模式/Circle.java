package _01工厂设计模式;

/**
 * 圆类, 继承了Shape接口类
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
