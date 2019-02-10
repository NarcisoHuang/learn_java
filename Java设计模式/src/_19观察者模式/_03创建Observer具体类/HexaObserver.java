package _19观察者模式._03创建Observer具体类;

import _19观察者模式._01创建Subject类的包.Subject;
import _19观察者模式._02Observer类的包.Observer;

public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String " + Integer.toHexString(subject.getState() ).toUpperCase() );
    }
}
