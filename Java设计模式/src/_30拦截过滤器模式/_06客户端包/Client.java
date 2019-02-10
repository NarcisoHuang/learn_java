package _30拦截过滤器模式._06客户端包;

import _30拦截过滤器模式._05筛选管理器类包.FilterManager;

public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }
}
