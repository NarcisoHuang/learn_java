package _26业务代理模式._02实现接口的具体类;

import _26业务代理模式._01接口包.BusinessService;

public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
