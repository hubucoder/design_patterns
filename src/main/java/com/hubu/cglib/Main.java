package com.hubu.cglib;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        final UserService userService = new UserService();
        Enhancer enhancer = new Enhancer();
        // cglib 代理类
        enhancer.setSuperclass(UserService.class);
        // MethodInterceptor 是一个继承了 Callback 接口的接口
        enhancer.setCallbacks(new Callback[]{new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                // test 方法增加了其他逻辑
                if (method.getName().equals("test")) {
                    System.out.println("before...");
                    Object result = method.invoke(userService, objects);
                    System.out.println("after...");
                    return result;
                }
                // 其他方法正常执行
                return method.invoke(userService, objects);
            }
        }
        });

        UserService service = (UserService) enhancer.create();
        service.test();
    }
}
