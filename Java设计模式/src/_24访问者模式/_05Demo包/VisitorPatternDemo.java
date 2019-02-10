package _24访问者模式._05Demo包;


import _24访问者模式._01接口包.ComputerPart;
import _24访问者模式._02扩展接口的具体类包.Computer;
import _24访问者模式._04实现访问者接口的具体类包.ComputerPartDisplayVisitor;

public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computerPart = new Computer();
        computerPart.accept(new ComputerPartDisplayVisitor());
    }
}
