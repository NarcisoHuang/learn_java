package _30拦截过滤器模式._04过滤器链包;

import _30拦截过滤器模式._01接口包.Filter;
import _30拦截过滤器模式._03Target类包.Target;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    private List<Filter> filterList = new ArrayList<Filter>();
    private Target target;

    public void addFilter(Filter filter) {
        filterList.add(filter);
    }

    public void execute(String request) {
        for (Filter filter :
                filterList) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
