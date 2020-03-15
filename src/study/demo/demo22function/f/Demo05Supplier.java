package study.demo.demo22function.f;

import java.util.function.Supplier;

//Supplier接口
//Supplier<T>接口被称之为生产型接口，指定接口的泛型是什么类型。get方法就会产生什么类型的数据
public class Demo05Supplier {
    public static void main(String[] args) {
        String msg1 = "hello";
        String msg2 = "world";
        //直接重写
        String res = getString(new Supplier<String>() {
            @Override
            public String get() {
                return msg1 + " " + msg2;
            }
        });
        //Lambda表达式
        String res2 = getString(()->{
            return msg1 + " " + msg2;
        });
        System.out.println(res);
        System.out.println(res2);
    }
    public static String getString(Supplier<String> sup) {
        return sup.get();
    }
}
