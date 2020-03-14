package study.demo.demo06;

import java.util.HashSet;
//HashSet存自定义类型元素。需要重写equals和hashCode方法
public class Demo02Set {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        Student s1  = new Student("常",1);
        Student s2  = new Student("常",1);
        Student s3  = new Student("常12",12);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);
    }
}
