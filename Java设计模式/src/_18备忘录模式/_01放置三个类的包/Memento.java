package _18备忘录模式._01放置三个类的包;

/**
 * 创建和存储状态
 */
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
