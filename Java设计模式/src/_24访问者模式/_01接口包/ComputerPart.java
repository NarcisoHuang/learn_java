package _24访问者模式._01接口包;

import _24访问者模式._03表示访问者的接口类包.ComputerPartVisitor;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
