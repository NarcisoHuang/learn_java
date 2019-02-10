package _18备忘录模式._02Demo包;

import _18备忘录模式._01放置三个类的包.CareTaker;
import _18备忘录模式._01放置三个类的包.Originator;

public class MementoPatternDemo {
    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        //将其保存在容器中
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        //将其保存在容器中
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #4");
        //没有保存在容器中, 只是打印出来而已
        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());

    }
}
