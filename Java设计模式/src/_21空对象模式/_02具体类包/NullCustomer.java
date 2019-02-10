package _21空对象模式._02具体类包;

import _21空对象模式._01抽象类包.AbstractCustomer;

public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
