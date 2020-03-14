package study.demo.demo06;

import java.util.ArrayList;
import java.util.Random;

public class Lianxi {
    public static void main(String[] args) {
        lianxi2();
    }

    //将六个随机数加入到ArrayList中，并遍历
    public static void lianxi1() {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            int res = random.nextInt(33);
            list.add(res);
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    // 集合中存储自定义对象
    public static void lianxi2() {
        ArrayList<Person> list = new ArrayList<>();
        Person person1 = new Person("常",1);
        Person person2 = new Person("云",2);
        Person person3 = new Person("育",3);
        list.add(person1);
        list.add(person2);
        list.add(person3);
        System.out.println(list);
        for (int i = 0; i< list.size();i++) {
            System.out.println(list.get(i).getName());
            System.out.println(list.get(i).getAge());
        }
    }
}
