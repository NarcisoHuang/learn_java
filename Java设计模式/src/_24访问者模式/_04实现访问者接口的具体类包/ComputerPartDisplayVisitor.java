package _24访问者模式._04实现访问者接口的具体类包;

import _24访问者模式._02扩展接口的具体类包.Computer;
import _24访问者模式._02扩展接口的具体类包.Keyboard;
import _24访问者模式._02扩展接口的具体类包.Monitor;
import _24访问者模式._02扩展接口的具体类包.Mouse;
import _24访问者模式._03表示访问者的接口类包.ComputerPartVisitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor {
    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Displaying Keyboard.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Displaying Monitor.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Displaying Mouse.");
    }

    @Override
    public void visit(Computer computer) {
        System.out.println("Displaying Computer.");
    }
}
