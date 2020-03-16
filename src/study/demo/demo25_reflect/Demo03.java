package study.demo.demo25_reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

//构造方法
public class Demo03 {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Person> cls = Person.class;
        Constructor<?>[] con1 = cls.getConstructors();
        System.out.println(Arrays.toString(con1));

        System.out.println("=========================================");

        Constructor<Person> con2 = cls.getConstructor(String.class, int.class);
        System.out.println(con2);

        Person chang = con2.newInstance("chang", 12);
        System.out.println(chang);
        System.out.println("=========================================");

    }
}
