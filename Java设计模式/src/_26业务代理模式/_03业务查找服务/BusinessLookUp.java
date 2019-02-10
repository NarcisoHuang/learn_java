package _26业务代理模式._03业务查找服务;

import _26业务代理模式._01接口包.BusinessService;
import _26业务代理模式._02实现接口的具体类.EJBService;
import _26业务代理模式._02实现接口的具体类.JMSService;

public class BusinessLookUp {
    public BusinessService getBusinessLookUp(String serviceType) {
        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}
