package _19观察者模式._04Demo包;

import _19观察者模式._01创建Subject类的包.Subject;
import _19观察者模式._03创建Observer具体类.BinaryObserver;
import _19观察者模式._03创建Observer具体类.HexaObserver;
import _19观察者模式._03创建Observer具体类.OctalObserver;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Send state change: 10");
        subject.setState(10);
    }
}
