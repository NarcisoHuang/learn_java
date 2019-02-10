package _19观察者模式._01创建Subject类的包;

import _19观察者模式._02Observer类的包.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observerList = new ArrayList<Observer>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observerList.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer :
                observerList) {
            observer.update();
        }
    }
}
