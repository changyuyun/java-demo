package study.demo.demo06;

import java.util.LinkedList;
//链接列表
public class Demo01LinkedList {
    public static void main(String[] args) {
        LinkedList<String> list =  new LinkedList<>();
        list.add("123");
        list.addLast("789");
        System.out.println(list);
    }
}
