package com.hubu.pattern._15_responsibility.jdk;

public class Client {
    public static void main(String[] args) {
        /*
         * 这里我们声明了两个变量，一个是Request类型的req，还有一个是Response类型的res，
         * 而且它俩都被赋予了一个null的值，这是为了补全语法，不至于让程序在编译以及运行时报错！
         */
        Request req = null;
        Response res = null;

        FilterChain filterChain = new FilterChain();
        // 组建过滤器链对象
        filterChain.addFilter(new FirstFilter()).addFilter(new SecondFilter());
        filterChain.doFilter(req, res);
    }
}
