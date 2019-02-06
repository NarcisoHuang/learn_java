package _01工厂设计模式;

/**
 * 矩形类, 继承Shape接口
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
