package _23模版模式._02扩展抽象类的具体类包;

import _23模版模式._01抽象类包.Game;

public class Cricket extends Game {

    @Override
    public void initialize() {
        System.out.println("Cricket game Initialized! Start playing.");
    }

    @Override
    public void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }

    @Override
    public void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
