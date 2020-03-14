package study.demo;
//优先是用入参
//this.成员变量可以指定使用
public class Person {
    String name;

    public void say(String name) {
        System.out.print(this.name + " 我是:" + name);
    }
}
