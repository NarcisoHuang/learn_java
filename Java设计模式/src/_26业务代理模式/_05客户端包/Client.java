package _26业务代理模式._05客户端包;

import _26业务代理模式._04业务代理包.BusinessDelegate;

public class Client {
    BusinessDelegate businessDelegate;

    public Client(BusinessDelegate businessDelegate) {
        this.businessDelegate = businessDelegate;
    }

    public void doTask() {
        businessDelegate.doTask();
    }
}
