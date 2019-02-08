package _11门面模式_或_外观模式._03创建外观类;

import _11门面模式_或_外观模式._01接口包.Shape;
import _11门面模式_或_外观模式._02创建实现几个相同接口的具体类.Circle;
import _11门面模式_或_外观模式._02创建实现几个相同接口的具体类.Rectangle;
import _11门面模式_或_外观模式._02创建实现几个相同接口的具体类.Square;

public class ShapeMaker {

    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }


    public void drawCircle(){
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
    public void drawSquare(){
        square.draw();
    }

}
