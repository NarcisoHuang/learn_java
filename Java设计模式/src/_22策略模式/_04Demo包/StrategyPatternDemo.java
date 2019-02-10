package _22策略模式._04Demo包;

import _22策略模式._02具体类包.OperationAdd;
import _22策略模式._02具体类包.OperationMultiply;
import _22策略模式._02具体类包.OperationSubstract;
import _22策略模式._03上下文类包.Context;

public class StrategyPatternDemo {
    public static void main(String[] args) {

        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10,5) );

        context = new Context(new OperationSubstract());
        System.out.println("10 - 5 = " + context.executeStrategy(10,5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10,5));
    }
}
