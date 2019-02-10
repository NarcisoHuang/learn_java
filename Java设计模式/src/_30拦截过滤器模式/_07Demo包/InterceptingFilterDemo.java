package _30拦截过滤器模式._07Demo包;

import _30拦截过滤器模式._02具体过滤器包.AuthenticationFilter;
import _30拦截过滤器模式._02具体过滤器包.DebugFilter;
import _30拦截过滤器模式._03Target类包.Target;
import _30拦截过滤器模式._05筛选管理器类包.FilterManager;
import _30拦截过滤器模式._06客户端包.Client;

public class InterceptingFilterDemo {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOUSE");
    }
}
