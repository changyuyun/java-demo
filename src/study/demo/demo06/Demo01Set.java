package study.demo.demo06;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
// set
//禁止重复元素
//没有索引，不能循环遍历
//HashSet存自定义类型元素。需要重写equals和hashCode方法
public class Demo01Set {
    public static void main(String[] args) {
        //无序集合，hash表结构，查询快
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println(set);
        //迭代器遍历set集合
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            int n = it.next();
            System.out.println(n);
        }

    }
}
