package study.demo.demo23_stream;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Practice {
    public static void main(String[] args) {
        //队伍1
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("常育云");
        list1.add("常云");
        list1.add("常育");
        list1.add("育云");
        Stream<String> stream1 = list1.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() == 3;
            }
        }).limit(3);
        //队伍2
        ArrayList<String> list2 = new ArrayList<>();
        list1.add("常育云");
        list1.add("常云");
        list1.add("常育");
        list1.add("育云");
        Stream<String> stream2 = list2.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("常");
            }
        }).skip(2);
        Stream.concat(stream1, stream2).map(name->new Person(name)).forEach(p-> System.out.println(p));
    }
}
