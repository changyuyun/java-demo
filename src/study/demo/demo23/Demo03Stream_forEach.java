package study.demo.demo23;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.stream.Stream;

//Stream流中的常用方法 forEach
//void forEach(Consumer<? super T> action)
//参数是一个Consumer接口函数。函数式接口
public class Demo03Stream_forEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("3");
        list.add("2");
        list.add("5000");
        System.out.println(list);
        Stream<String> stream = list.stream();
        stream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
    }
}
