package _12享元模式_自己理解为轻量模式._02创建一个实现Shape接口的具体类;

import _12享元模式_自己理解为轻量模式._01接口包.Shape;

public class Circle implements Shape {

    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color: " + color + ", X: " + x + ", Y: " + y + ", radius" + radius);
    }

}
