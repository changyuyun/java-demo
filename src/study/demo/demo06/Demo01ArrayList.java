package study.demo.demo06;

import java.util.ArrayList;

// ArrayList
//ArrayList集合的长度是可以随便改变的
//<E>代表泛型：统一的类型。只能是引用类型，不能是基本类型
//ArrayList打印得到的是内容
public class Demo01ArrayList {
    public static void main(String[] args) {
        //创建
        ArrayList<String> list = new ArrayList<String>();
        System.out.println(list);
        list.add("1123");
        list.add("4567");
        System.out.println(list);

        //常用方法
        // add get remove size
        String s = list.get(0);
        System.out.println(s);
        list.remove(0);
        System.out.println(list.size());

        ArrayList<String> list2 = new ArrayList<>();
        System.out.println(list2.size());

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("常");
        list3.add("育");
        list3.add("云");
        System.out.println(list3);
        int size = list3.size();
        for (int i = 0; i<size;i++) {
            System.out.println(list3.get(i));
        }
    }
}
