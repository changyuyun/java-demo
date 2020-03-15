package study.demo.demo23_stream;

import java.util.function.Consumer;
import java.util.stream.Stream;

//如果需要将流中的元素映射到另一个流中，可以使用map方法
//<R> Stream<R> map(Function<? super T,? extends R> mapper)
public class Demo05Stream_map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1","2","3", "4", "5");
        Stream<Integer> stream2 = stream.map((String s) -> {
            return Integer.parseInt(s);
        });
        stream2.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

    }
}
