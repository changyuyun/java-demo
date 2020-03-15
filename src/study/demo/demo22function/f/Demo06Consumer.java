package study.demo.demo22function.f;

import java.util.function.Consumer;

//Consumer接口：消费型接口
//消费一个数据，数据类型由泛型决定
public class Demo06Consumer {
    public static void main(String[] args) {
        //1.
        /*String name = "常育云";
        //函数式接口调用
        consumerString(name, new Consumer<String>() {
            @Override
            public void accept(String s) {
                //直接输出
                System.out.println(s);
                //反转字符串
                String res = new StringBuffer(s).reverse().toString();
                System.out.println(res);
            }
        });
        //Lambda
        consumerString(name, (s)-> System.out.println(s));*/
        //2.
        String str = "hello";
        //Lambda
        consumerAndThenString(
                str,
                (s)->{
                    System.out.println(s.toUpperCase());
                },
                (s)->{
                    System.out.println(s.replace("o", "*"));
                }
                );
    }
    //accept
    public static void consumerString(String name, Consumer<String> con) {
        con.accept(name);
    }

    //andThen
    public static void consumerAndThenString(String str, Consumer<String> con1, Consumer<String> con2) {
        //前边的先消费
        con1.andThen(con2).accept(str);
    }



}
