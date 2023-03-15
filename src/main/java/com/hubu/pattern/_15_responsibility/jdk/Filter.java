package com.hubu.pattern._15_responsibility.jdk;

public interface Filter {
    public void doFilter(Request req, Response res, FilterChain c);
}
