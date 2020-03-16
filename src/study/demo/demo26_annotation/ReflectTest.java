package study.demo.demo26_annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//在程序中使用（解析）注解：注解大多用于配置文件的读取
@Pro(className = "study.demo.demo26_annotation.Test01", methodName = "show")
public class ReflectTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //1.解析注解
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        //2.获取注解对象
        Pro annotation = reflectTestClass.getAnnotation(Pro.class);

        //3.调用注解中定义的抽象方法
        String className = annotation.className();
        String methodName = annotation.methodName();

        Class<?> cls = Class.forName(className);
        Object o = cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(o);

    }
}
