package study.demo.demo10;

import java.util.HashMap;
import java.util.Scanner;
//统计字符串中字符出现的次数
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        //System.out.println(arr);
        HashMap<Character,Integer> map = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        //1.
        for (int i = 0; i < str.length(); i++) {
            Character item = str.charAt(i);
            if (map.containsKey(item)) {
                int count = map.get(item)+1;
                map.put(item, count);
            } else {
                map.put(item, 1);
            }
            System.out.println(str.charAt(i));
        }
        //2.char arr
        for (char c:arr) {
            System.out.println(c);
            Character item = c;
            if (map2.containsKey(item)) {
                int count = map2.get(item)+1;
                map2.put(item, count);
            } else {
                map2.put(item, 1);
            }
        }
        System.out.println(map);
        System.out.println(map2);
        //HashMap


    }
}
