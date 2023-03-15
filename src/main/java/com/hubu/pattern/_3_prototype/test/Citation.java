package com.hubu.pattern._3_prototype.test;

public class Citation implements Cloneable{
    // 三好学生上的姓名
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    /**
     *
     * @return 因为克隆出来的肯定是三号学生类的对象，所以我们要将clone方法的返回值类型修改为Citation
     * @throws CloneNotSupportedException
     */
    @Override
    protected Citation  clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show() {
        System.out.println(name + "同学：在2021学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }
}
