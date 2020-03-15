package study.demo.demo24;
//方法引用
public class Demo01PrintSimple {
    public static void main(String[] args) {
        String str = "hello";
        //匿名函数
        printString(str, new Printable() {
            @Override
            public void print(String str) {
                System.out.println(str);
            }
        });
        //Lambda
        printString(str,(s)->{System.out.println(s);});

        //方法引用
        //System.out
        //println
        printString(str,System.out::println);
    }

    public static void printString(String str, Printable p) {
        p.print(str);
    }
}
