package study.demo.demo22function;

import java.util.Comparator;

//函数式接口作为返回值
public class Demo04Comparator {
    public static Comparator<String> getComparator() {

        /*return new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return s.length()-t1.length();
            }
        };*/

        //用到函数式接口的地方都可以转化为lambda表达式
        /*return (String s, String t1)->{
            return s.length()-t1.length();
        };*/

        return (s,t1)-> s.length()-t1.length();
    }
}
