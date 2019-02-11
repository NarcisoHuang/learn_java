package _02Lambda表达式;

/**
 * lambda表达式主要用于定义内联执行的功能的接口，即只有一个单一的方法接口。
 * 在下面的例子中，我们使用不同类型的lambda表达式定义MathOperation接口的opearation方法。
 * 然后，我们定义GreetingService的sayMessage实现。
 *
 * Lambda表达式消除匿名类的需求，并给出了一个非常简单但功能强大的函数式编程能力。
 *
 */
public class Java8Tester {
    public static void main(String[] args) {
        Java8Tester tester = new Java8Tester();

        MathOperation addition = (int a, int b) -> a + b;

        MathOperation subtraction = (int a, int b) -> a - b;

        MathOperation multiplication = (int a, int b) -> {return a * b;};

        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10,5,subtraction));
        System.out.println("10 * 5 = " + tester.operate(10,5,multiplication));
        System.out.println("10 / 5 = " + tester.operate(10,5,division));

        GreetingService greetingService1 = message -> System.out.println("Hello " + message);
        GreetingService greetingService2 = (message) -> System.out.println("Hello " + message);

        greetingService1.sayMessage("Mahesh");
        greetingService2.sayMessage("Suresh");
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
