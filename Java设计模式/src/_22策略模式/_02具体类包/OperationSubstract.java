package _22策略模式._02具体类包;

import _22策略模式._01接口包.Strategy;

public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
