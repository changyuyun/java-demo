package study.demo.demo06;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Demo02ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //无法存储基本类型:
        // byte,
        // short,
        // int,
        // long,
        // float,
        // double,
        // char,
        // boolean
        //ArrayList<int> list2 = new ArrayList<int>();
        //需要使用包装类 java.lang
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Short> list4 = new ArrayList<>();
        ArrayList<Byte> list5 = new ArrayList<>();
        ArrayList<Long> list6 = new ArrayList<>();
        ArrayList<Float> list7 = new ArrayList<>();
        ArrayList<Double> list8 = new ArrayList<>();
        ArrayList<Character> list9 = new ArrayList<>();
        ArrayList<Boolean> list10 = new ArrayList<>();
        list3.add(100);
        list3.add(200);
        list3.add(300);
        int a = list3.get(2);
        System.out.println(a);
    }
}
