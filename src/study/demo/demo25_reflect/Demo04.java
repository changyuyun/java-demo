package study.demo.demo25_reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

//成员方法
public class Demo04 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Class<Person> cls = Person.class;
        Method[] methods = cls.getMethods(); //获取公共成员方法

        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("===================================");

        Method[] declaredMethods = cls.getDeclaredMethods(); //获取声明的成员方法

        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
        }

        System.out.println("===================================");

        Method test = cls.getDeclaredMethod("test");
        Method testAnother = cls.getDeclaredMethod("testAnother", String.class);
        Person p = new Person();
        test.setAccessible(true);
        testAnother.setAccessible(true);
        test.invoke(p);
        testAnother.invoke(p, "world");

    }
}
