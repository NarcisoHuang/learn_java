package _30拦截过滤器模式._02具体过滤器包;

import _30拦截过滤器模式._01接口包.Filter;

public class AuthenticationFilter implements Filter {
    @Override
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
