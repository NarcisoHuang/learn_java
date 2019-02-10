package _19观察者模式._03创建Observer具体类;

import _19观察者模式._01创建Subject类的包.Subject;
import _19观察者模式._02Observer类的包.Observer;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
