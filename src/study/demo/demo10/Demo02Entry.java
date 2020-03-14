package study.demo.demo10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//entry
public class Demo02Entry {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("name", "chang");
        map.put("sex", "1");
        map.put("age", "12");
        map.put("work", "program");
        System.out.println(map);
        //entry set集合
        Set<HashMap.Entry<String,String>> set = map.entrySet();
        System.out.println(set);

        //遍历 迭代器
        Iterator<HashMap.Entry<String,String>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<String,String> entry = it.next();
            System.out.println(entry);
            System.out.println(map.get(entry.getKey()));
        }
        System.out.println("==================================");
        //遍历 增强for
        for (HashMap.Entry<String,String> entry:set) {
            System.out.println(map.get(entry.getKey()));
        }
    }
}
