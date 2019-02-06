package _01工厂设计模式;

/**
 * 正方形类, 继承了Shape接口类
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
