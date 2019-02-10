package _24访问者模式._02扩展接口的具体类包;

import _24访问者模式._01接口包.ComputerPart;
import _24访问者模式._03表示访问者的接口类包.ComputerPartVisitor;

public class Computer implements ComputerPart {

    ComputerPart[] parts;

    public Computer() {
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
