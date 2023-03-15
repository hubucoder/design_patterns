package com.hubu.pattern._3_prototype.test.extension.Shallow_clone;

/**
 * @Description 扩展：深克隆
 * @Author wanght
 * @Email wanght.w@outlook.com
 * @Date 2022/5/2 11:44
 **/
public class Citation implements Cloneable {
    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    /**
     * @return 因为克隆出来的肯定是三号学生类的对象，所以我们要将clone方法的返回值类型修改为Citation
     * @throws CloneNotSupportedException
     */
    @Override
    public Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show() {
        System.out.println(stu.getName() + "同学：在2021学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }
}
