package _10装饰模式._04创建扩展ShapeDecorator的具体装饰类;

import _10装饰模式._01Shape接口包.Shape;
import _10装饰模式._03创建实现Shape接口的抽象装饰类.ShapeDecorator;

public class RedShapeDecorator extends ShapeDecorator {

    /**
     * 继承ShapeDecorator类中的构造方法
     * public ShapeDecorator(Shape ShapeDecorator){}
     * @param decoratedShape
     */
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        /**
         * 继承自_03包内的ShapeDecorator类的decoratedShape变量
         */
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }

}
