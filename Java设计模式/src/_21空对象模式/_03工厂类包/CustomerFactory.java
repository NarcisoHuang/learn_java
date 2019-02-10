package _21空对象模式._03工厂类包;

import _21空对象模式._01抽象类包.AbstractCustomer;
import _21空对象模式._02具体类包.NullCustomer;
import _21空对象模式._02具体类包.RealCustomer;

public class CustomerFactory {

    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }

        return new NullCustomer();
    }
}
