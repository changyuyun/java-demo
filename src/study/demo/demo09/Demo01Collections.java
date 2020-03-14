package study.demo.demo09;

import java.util.ArrayList;
import java.util.Collections;

public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        System.out.println(list);
        //批量添加
        Collections.addAll(list, "a","b","c");
        //打乱顺序
        Collections.shuffle(list);
        //默认排序
        Collections.sort(list);
        System.out.println(list);

        ArrayList<Person> list1 = new ArrayList<>();
        list1.add(new Person("cyy", 12));
        list1.add(new Person("cyys", 10));
        list1.add(new Person("cyyss", 9));
        //对自定义对象排序
        Collections.sort(list1);
        System.out.println(list1);
    }
}
