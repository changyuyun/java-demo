package study.demo.demo23_stream;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
//count:获取元素个数
public class Demo06Stream_count {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1","2","12","123");
        Stream<String> stream2 = stream.filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 1;
            }
        });
        long count = stream2.count();
        System.out.println(count);
        //limit:取用前几个
        Stream<String> stream3 = Stream.of("1","2","12","123");
        Stream<String> stream4 = stream3.limit(1);
        System.out.println(stream4.count());
        System.out.println();
        //skip:跳过前几个
        Stream<String> stream5 = Stream.of("1","2","12","123");
        Stream<String> stream6 = stream5.skip(1);
        stream6.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println();
        //组合流：concat
        Stream<String> s1 = Stream.of("1","2","12","123");
        Stream<String> s2 = Stream.of("456","567","789","0");
        Stream<String> res = Stream.concat(s1, s2);

        res.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

    }
}
