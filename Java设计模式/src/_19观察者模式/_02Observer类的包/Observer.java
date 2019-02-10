package _19观察者模式._02Observer类的包;

import _19观察者模式._01创建Subject类的包.Subject;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
