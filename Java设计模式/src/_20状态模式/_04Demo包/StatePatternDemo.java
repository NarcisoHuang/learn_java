package _20状态模式._04Demo包;

import _20状态模式._02接口具体实现包.StartState;
import _20状态模式._02接口具体实现包.StopState;
import _20状态模式._03Context类包.Context;

public class StatePatternDemo {
    public static void main(String[] args) {

        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
