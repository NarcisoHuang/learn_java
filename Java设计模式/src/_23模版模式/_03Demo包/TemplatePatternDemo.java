package _23模版模式._03Demo包;

import _23模版模式._01抽象类包.Game;
import _23模版模式._02扩展抽象类的具体类包.Cricket;
import _23模版模式._02扩展抽象类的具体类包.Football;

public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();

        System.out.println();
        game = new Football();
        game.play();
    }
}
