package _10装饰模式._05使用RedShapeDecorator装饰Shape对象;

import _10装饰模式._01Shape接口包.Shape;
import _10装饰模式._02实现Shape接口的具体类包.Circle;
import _10装饰模式._02实现Shape接口的具体类包.Rectangle;
import _10装饰模式._04创建扩展ShapeDecorator的具体装饰类.RedShapeDecorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {

        //创建对象
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        //输出验证
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\n\nCircle of red border");
        redCircle.draw();

        System.out.println("\n\nRectangle of red border");
        redRectangle.draw();
    }
}
