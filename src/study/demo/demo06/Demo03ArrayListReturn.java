package study.demo.demo06;

import java.util.ArrayList;
import java.util.Random;

public class Demo03ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 10; i ++) {
            list.add(r.nextInt(100) + 1);
        }
        System.out.println(list);
        ArrayList<Integer> res = getList(list);
        System.out.println(res);
    }

    public static ArrayList<Integer> getList(ArrayList<Integer> list) {
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (num % 2 == 0) {
                list2.add(num);
            }
        }
        return list2;
    }
}
