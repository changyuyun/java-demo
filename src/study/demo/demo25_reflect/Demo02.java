package study.demo.demo25_reflect;

import java.lang.reflect.Field;
import java.util.Arrays;
//成员变量
public class Demo02 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<Person> cls = Person.class;
        Field[] fields = cls.getFields(); //获取所有public修饰的成员变量
        System.out.println(Arrays.toString(fields));
        Field fields3 = cls.getField("sex");

        //应用
        Person p = new Person();
        System.out.println(fields3);
        System.out.println(fields3.get(p));
        fields3.set(p,2);
        System.out.println(p);

        System.out.println("=================================================");
        Field[] fields2 = cls.getDeclaredFields(); //获取所有声明的成员变量
        for (Field field : fields2) {
            System.out.println(field);
        }
        //System.out.println(Arrays.toString(fields2));

        Field field4 = cls.getDeclaredField("name");
        field4.setAccessible(true); //暴力反射 忽略访问权限修饰符的安全检查
        field4.set(p, "chang");
        Object value = field4.get(p);
        System.out.println(value);
    }
}
