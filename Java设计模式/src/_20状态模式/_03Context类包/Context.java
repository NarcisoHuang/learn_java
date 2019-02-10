package _20状态模式._03Context类包;

import _20状态模式._01接口包.State;

public class Context {
    private State state;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
