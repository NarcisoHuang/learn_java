package _02抽象工厂模式._03具体颜色包;

import _02抽象工厂模式._01接口包.Color;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
