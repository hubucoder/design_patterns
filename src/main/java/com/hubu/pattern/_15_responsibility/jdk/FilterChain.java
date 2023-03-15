package com.hubu.pattern._15_responsibility.jdk;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();

    private int index = 0;

    /**
     * 添加过滤器
     *
     * 调用该方法，其实就是把过滤器添加到以上List集合里面。而且，该方法对外还有一个作用，创建过滤器链对象，即将过滤器链对象组建好。
     * @param filter
     * @return
     */
    public FilterChain addFilter(Filter filter) {
        this.filters.add(filter);
        return this;
    }

    public void doFilter(Request request, Response response) {
        if (index == filters.size()) {
            return;
        }
        Filter filter = filters.get(index);
        index++;
        filter.doFilter(request, response, this);
    }
}
