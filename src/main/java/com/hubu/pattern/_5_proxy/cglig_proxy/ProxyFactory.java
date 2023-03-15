package com.hubu.pattern._5_proxy.cglig_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
/**
 * @Description 获取对象工厂，用来获取代理对象
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/4 14:49
 **/
public class ProxyFactory implements MethodInterceptor {

    // 声明火车站对象
    private TrainStation station = new TrainStation();

    public TrainStation getProxyObject() {
        // 1. 创建Enhancer类对象，它类似于咱们JDK动态代理中的Proxy类，很明显，该类就是用来获取代理对象的
        Enhancer enhancer = new Enhancer();
        // 2. 设置父类的字节码对象。为啥子要这样做呢？因为使用CGLIB生成的代理类是属于目标类的子类的，也就是说代理类是要继承自目标类的
        enhancer.setSuperclass(TrainStation.class);
        // 3. 设置回调函数
        enhancer.setCallback(this);
        // 4. 创建代理对象
        TrainStation proxyObject = (TrainStation) enhancer.create();
        return proxyObject;
    }

    /**
     * intercept方法参数说明：
     * @param Object o：代理对象
     * @param Method method：真实对象中的方法的Method实例。在本案例中，它表示的就是sell方法
     * @param Object[] objects：调用方法的实际参数
     * @param MethodProxy methodProxy：代理对象中的方法的Method实例
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        // System.out.println("方法执行了");
        // return null;
        System.out.println("代售点收取一定的服务费用（CGLIB代理）");
        // 通过反射的方式去调用目标对象的方法
        Object obj = method.invoke(station, objects);
        return obj; // 注意，目前我们通过代理对象调用sell方法时是没有返回值的，所以invoke方法返回的就是null
    }
}
