package _13责任链模式._03Demo类;

import _13责任链模式._01抽象类包.AbstractLogger;
import _13责任链模式._02创建几个扩展抽象类的具体类.ConsoleLogger;
import _13责任链模式._02创建几个扩展抽象类的具体类.ErrorLogger;
import _13责任链模式._02创建几个扩展抽象类的具体类.FileLogger;

public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG,"This is an debug level information.");
        loggerChain.logMessage(AbstractLogger.ERROR,"This is an error information.");

    }
}
