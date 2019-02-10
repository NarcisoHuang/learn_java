package _20状态模式._02接口具体实现包;

import _20状态模式._01接口包.State;
import _20状态模式._03Context类包.Context;

public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}
