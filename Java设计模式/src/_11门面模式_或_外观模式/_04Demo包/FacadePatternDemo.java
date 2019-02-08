package _11门面模式_或_外观模式._04Demo包;

import _11门面模式_或_外观模式._03创建外观类.ShapeMaker;

public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
