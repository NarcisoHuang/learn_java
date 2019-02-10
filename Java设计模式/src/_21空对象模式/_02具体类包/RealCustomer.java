package _21空对象模式._02具体类包;

import _21空对象模式._01抽象类包.AbstractCustomer;

public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
