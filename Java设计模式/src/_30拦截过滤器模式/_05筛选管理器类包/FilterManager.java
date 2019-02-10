package _30拦截过滤器模式._05筛选管理器类包;

import _30拦截过滤器模式._01接口包.Filter;
import _30拦截过滤器模式._03Target类包.Target;
import _30拦截过滤器模式._04过滤器链包.FilterChain;

public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target) {
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }

    public void setFilter(Filter filter) {
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request) {
        filterChain.execute(request);
    }
}
