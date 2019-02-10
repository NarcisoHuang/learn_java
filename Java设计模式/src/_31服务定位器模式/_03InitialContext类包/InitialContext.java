package _31服务定位器模式._03InitialContext类包;

import _31服务定位器模式._02Service接口的具体实现类包.*;

public class InitialContext {

    public Object lookup(String jndiName) {
        if (jndiName.equalsIgnoreCase("SERVICE1")) {
            System.out.println("Looking up and creating a Service1 object");
            return new Service1();
        } else if (jndiName.equalsIgnoreCase("SERVICE2")) {
            System.out.println("Looking up and creating a Service2 object");
            return new Service2();
        } else {
            return null;
        }
    }

}
