package _13责任链模式._02创建几个扩展抽象类的具体类;

import _13责任链模式._01抽象类包.AbstractLogger;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
