package study.demo.demo10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

//Map HashMap
//无序集合 key不重复 value可重复
public class Demo01Map {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("name", "chang");
        map.put("sex", "1");
        map.put("age", "18");
        map.put("work", "program");
        System.out.println(map);
        //System.out.println(map.containsKey("names"));//是否包含某个key
        //System.out.println(map.containsValue("chan"));//所有的value
        //System.out.println(map.values());//所有的values
        //System.out.println(map.keySet());//所有的keys
        //System.out.println(map.get("name"));//
        //System.out.println(map.toString());//
        //System.out.println(map.hashCode());//

        Set<String> set = map.keySet(); //得到的是一个set集合
        //遍历 使用迭代器
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String a = it.next();
            System.out.println(map.get(a));
        }
        //使用增强for遍历set集合
        for(String key: set) {
            System.out.println(map.get(key));
        }
    }
}
