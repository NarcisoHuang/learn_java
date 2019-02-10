package _24访问者模式._03表示访问者的接口类包;

import _24访问者模式._02扩展接口的具体类包.Computer;
import _24访问者模式._02扩展接口的具体类包.Keyboard;
import _24访问者模式._02扩展接口的具体类包.Monitor;
import _24访问者模式._02扩展接口的具体类包.Mouse;

public interface ComputerPartVisitor {
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
    public void visit(Mouse mouse);
    public void visit(Computer computer);
}
