package study.demo.demo23_stream;

import java.util.*;
import java.util.stream.Stream;
//所有的Collection集合都可以通过stream默认方法获取流
//Stream接口静态方法of可以获取数组对应的流
public class Demo02Stream {
    public static void main(String[] args) {
        //list
        ArrayList<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();
        //set
        HashSet<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();
        //map
        HashMap<String,String> map = new HashMap<>();
        Stream<String> stream3 = map.keySet().stream();

        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();

        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        Stream<Map.Entry<String, String>> stream5 = entrySet.stream();

        //数组转化了stream
        String[] arr = new String[10];
        Stream<String> stream6 = Arrays.stream(arr);
        Stream<String> stream7 = Stream.of(arr);
        System.out.println(stream6);
        System.out.println(stream7);

    }
}
