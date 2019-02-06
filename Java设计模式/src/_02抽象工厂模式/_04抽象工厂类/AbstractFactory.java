package _02抽象工厂模式._04抽象工厂类;

import _02抽象工厂模式._01接口包.*;

public abstract class AbstractFactory {
    /*s实现抽象的接口*/
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
