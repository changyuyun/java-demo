package study.demo.demo10;

import java.util.HashMap;
import java.util.Set;

//HashMap中存储自定义对象
public class Demo03HashMapPerson {
    public static void main(String[] args) {
        HashMap<String,Person> map = new HashMap<>();
        Person p1 = new Person("chang",  12);
        Person p2 = new Person("chang2",  10);
        Person p3 = new Person("chang3",  2);
        map.put("北京", p1);
        map.put("上海", p2);
        map.put("山西", p3);
        map.put("北京", p3);
        System.out.println(map);

        //遍历 for
        Set<String> set = map.keySet();
        System.out.println(set);
        for (String key:set) {
            Person value = map.get(key);
            System.out.println(value.getName());
            System.out.println(value.getAge());
        }
    }
}
