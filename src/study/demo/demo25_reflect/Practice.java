package study.demo.demo25_reflect;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

//案例
public class Practice {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //可以创建任意类的对象，可以创建任意方法
        //1.配置文件
        //2.反射
        //1.1创建Properties对象
        Properties properties = new Properties();
        //1.2加载配置文件，转为一个集合
        //1.2.1获取class目录下的配置文件
        ClassLoader classLoader = Practice.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("pro.properties");
        properties.load(resourceAsStream);

        //2.获取配置文件中定义的数据
        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        //3.加载该类进内存
        Class<?> cls = Class.forName(className);
        //4.创建对象
        Object o = cls.newInstance();
        //5.获取方法对象
        Method methods = cls.getMethod(methodName);

        methods.invoke(o);


    }

}
