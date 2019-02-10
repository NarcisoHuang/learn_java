package _26业务代理模式._06Demo包;

import _26业务代理模式._04业务代理包.BusinessDelegate;
import _26业务代理模式._05客户端包.Client;

public class BusinessDelegatePatternDemo {
    public static void main(String[] args) {

        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();
        System.out.println("====================");
        businessDelegate.setServiceType("JMS");
        client.doTask();

    }
}
