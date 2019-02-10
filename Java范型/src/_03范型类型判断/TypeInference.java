package _03范型类型判断;

public class TypeInference {
    public static void main(String[] args) {
        // 声明范型的类型， 没有检查
        Box2<Integer> integerBox2 = new Box2<>();
        // 声明范型的类型，检查类型
        Box2<String> stringBox2 = new Box2<String>();

        integerBox2.add(new Integer(192));
        stringBox2.add(new String("Hello World!"));

        System.out.println("Integer Value: " + integerBox2.get());
        System.out.println("String Value: " + stringBox2.get());

    }
}

class Box2<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
}
