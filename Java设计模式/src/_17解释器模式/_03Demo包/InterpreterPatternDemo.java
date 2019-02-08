package _17解释器模式._03Demo包;

import _17解释器模式._01创建表达式接口.Expression;
import _17解释器模式._02创建实现接口的具体类.AndExpression;
import _17解释器模式._02创建实现接口的具体类.OrExpression;
import _17解释器模式._02创建实现接口的具体类.TerminalExpression;

public class InterpreterPatternDemo {

    /**
     * getMaleExpression()方法返回一个Expression对象
     * getMaleExpression()方法设置规则 Robert和John性别女(就是设定这两个人的性别为女)
     * 通过TerminalExpression 对象设置date值
     * 通过OrExpression对象的构造方法将通过TerminalExpression 对象的date值传递给OrExpression对象
     * @return OrExpression 返回OrExpression对象
     * expression1 = robert
     * expression2 = john
     */
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    /**
     * getMarriedWomanExpression()方法返回一个Expression对象
     * getMarriedWomanExpression()方法设置Julie为已婚
     * 通过TerminalExpression 对象设置date值
     * 通过OrExpression对象的构造方法将通过TerminalExpression 对象的date值传递给OrExpression对象
     * @return OrExpression 返回OrExpression对象
     * expression1 = julie
     * expression2 = married
     * @return
     */
    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {

        /**
         * 通过静态方法规则对象
         * isMale : Robert和John性别为女
         * isMarriedWoman : Julie 已婚
         */
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        /**
         * isMale.interpret("John")
         * 将 isMale的参数"John" 分别和 AndExpression创建的对象的 expression1: "Robert" 和 expression2: "John" 比较
         * 只要 isMale的参数包含expression1或expression2中一个
         * 就返回True
         */

        /**
         * isMarriedWoman.interpret("Married Julie")
         * 调用interpret(String context)方法
         * 将interpret()方法的参数"Married Julie" 分和 AndExpression对象的 私有Expression变量 :
         * expression1和expression2的date值: "Julie" 和 "Married"比较
         * 只有 interpret方法的参数同时包含expression1和expression2的date值
         * 此时方法返回True.
         */
        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married woman? " + isMarriedWoman.interpret("Married Julie"));
    }
}
