package study.demo.demo22function.f;

import java.util.function.Predicate;

//Predicate接口：对某种类型的数据进行判断，结果返回一个boolean值
public class Demo07Predicate {
    public static void main(String[] args) {
        String str = "abcde";
        boolean r = checkString(str,(s)->{
            return str.length() > 5;
        });
        System.out.println(r);
    }
    public static boolean checkString(String str, Predicate<String> pre) {
        return pre.test(str);
    }
}
