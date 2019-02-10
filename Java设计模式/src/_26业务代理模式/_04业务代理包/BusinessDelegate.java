package _26业务代理模式._04业务代理包;

import _26业务代理模式._01接口包.BusinessService;
import _26业务代理模式._03业务查找服务.BusinessLookUp;

public class BusinessDelegate {
    private BusinessLookUp businessLookUp = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public void doTask() {
        businessService = businessLookUp.getBusinessLookUp(serviceType);
        businessService.doProcessing();
    }
}
