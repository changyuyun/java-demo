package study.demo.demo27_check;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * 简单的测试框架.加注解的自动
 */
public class TestCheck {
    public static void main(String[] args) throws IOException {
        //创建计算器对象
        Calculator calculator = new Calculator();
        //获取字节码文件对象
        Class<? extends Calculator> cls = calculator.getClass();
        //获取所有方法
        Method[] methods = cls.getMethods();
        int number = 0;//出现异常的次数
        BufferedWriter bw = new BufferedWriter(new FileWriter("bug.txt"));

        for (Method method : methods) {
            if (method.isAnnotationPresent(Check.class)) {
                //有 执行
                try {
                    method.invoke(calculator);
                } catch (Exception e) {
                    System.out.println(e);
                    //捕获异常
                    number ++;
                    bw.write(method.getName()+"方法有异常：");
                    bw.newLine();
                    bw.write("异常的名称："+e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因："+e.getCause().getMessage());
                    bw.newLine();
                    bw.write("===========================");
                    bw.newLine();
                }
            }
        }

        bw.write("本次测试一共出现" +number+ "异常");

        bw.flush();
        bw.close();

    }
}
