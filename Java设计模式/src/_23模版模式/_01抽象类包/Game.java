package _23模版模式._01抽象类包;

public abstract class Game {
    public abstract void initialize();
    public abstract void startPlay();
    public abstract void endPlay();

    //模版方法
    public final void play() {

        initialize();

        startPlay();

        endPlay();
    }
}
