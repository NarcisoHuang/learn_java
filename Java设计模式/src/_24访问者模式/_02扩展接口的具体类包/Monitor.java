package _24访问者模式._02扩展接口的具体类包;

import _24访问者模式._01接口包.ComputerPart;
import _24访问者模式._03表示访问者的接口类包.ComputerPartVisitor;

public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
