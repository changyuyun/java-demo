package study.demo;
//构造方法
//public 类名
//默认赠送构造方法
public class Student {
    private String name;
    private int age;
    //构造方法 不能有return。 可以重载
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.print("构造方法："+this.name);
    }
}
