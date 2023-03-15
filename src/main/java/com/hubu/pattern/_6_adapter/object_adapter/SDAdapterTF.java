package com.hubu.pattern._6_adapter.object_adapter;

/**
 * @Description 适配器类
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/5 10:44
 **/
public class SDAdapterTF implements SDCard {

    // 声明适配者类
    private TFCard tfCard;

    /*
     * 在适配器类的成员位置声明好了适配者类之后，我们肯定是要对它进行赋值的，所以，我们在这儿就提供了一个有参构造方法，
     * 通过该有参构造方法为适配者类赋值
     */
    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }

    public String readSD() {
        System.out.println("adapter read tf card");
        return tfCard.readTF(); // 如果我们使用适配器的话，那么真正的读取数据还是从TF卡里面去读取。所以，此处我们应调用TFCardImpl类里面的readTF方法
    }

    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard.writeTF(msg); // 同理，此处我们应调用TFCardImpl类里面的writeTF方法
    }
}
