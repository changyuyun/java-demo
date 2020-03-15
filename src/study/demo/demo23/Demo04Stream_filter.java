package study.demo.demo23;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

//Stream流中的常用方法 filter 过滤
public class Demo04Stream_filter {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("3");
        list.add("2");
        list.add("5000");
        Stream<String> stream = list.stream();
        Stream<String> res = stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 1;
            }
        });
        System.out.println(res);
        //遍历
        res.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //只能被消费一次 java.lang.IllegalStateException
        /*res.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
    }
}
