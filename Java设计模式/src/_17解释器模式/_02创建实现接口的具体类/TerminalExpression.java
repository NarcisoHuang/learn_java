package _17解释器模式._02创建实现接口的具体类;

import _17解释器模式._01创建表达式接口.Expression;

public class TerminalExpression implements Expression {

    private String data;

    /**
     * 带参数的构造方法设置data值
     * @param data
     */
    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {

        /**
         * 如果字符串context包含字符串date
         * 则返回True, 否则返回False
         */
        if (context.contains(data)) {
            return true;
        }

        return false;
    }

}
