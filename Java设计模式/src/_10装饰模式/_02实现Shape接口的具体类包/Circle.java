package _10装饰模式._02实现Shape接口的具体类包;

import _10装饰模式._01Shape接口包.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
