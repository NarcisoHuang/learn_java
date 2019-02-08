package _17解释器模式._02创建实现接口的具体类;

import _17解释器模式._01创建表达式接口.Expression;

public class OrExpression implements Expression {

    private Expression expression1 = null;
    private Expression expression2 = null;

    public OrExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }

    /**
     * 如果两个表达中有一个返回的是True, 则返回True
     * @param context
     * @return
     */
    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) || expression2.interpret(context);
    }
}
