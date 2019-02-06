package _02抽象工厂模式._03具体颜色包;

import _02抽象工厂模式._01接口包.Color;

/**
 * 具体颜色类, 继承intefacePackage包内的Colors接口
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
