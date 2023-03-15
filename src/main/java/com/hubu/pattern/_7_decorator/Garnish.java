package com.hubu.pattern._7_decorator;

public abstract class Garnish extends FastFood{
    // 声明快餐类的变量
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    /*
     * 在Garnish类中，我们还得提供如下有参构造，价格与描述这两属性是直接调用父类中的方法来进行设置的，
     * 至于FastFood类型的属性，懂得都懂！！！
     *
     * 注意，后面的两个参数所代表的意思。
     *      float price：配料（例如鸡蛋）的价格。例如，一个炒鸡蛋是1块钱
     *      String desc：配料（例如鸡蛋）的描述。例如，鸡蛋的描述肯定就是鸡蛋了
     */
    public Garnish(FastFood fastFood, float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }
}
