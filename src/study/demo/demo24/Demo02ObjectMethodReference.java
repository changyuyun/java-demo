package study.demo.demo24;
//通过对象名引用成员方法
public class Demo02ObjectMethodReference {
    public static void main(String[] args) {
        //普通调用
        /*printString((s)->{
            MethodRerObject obj = new MethodRerObject();
            obj.printUpperCaseString(s);
        });*/
        //使用对象引用优化
        MethodRerObject obj = new MethodRerObject();
        printString(obj::printUpperCaseString);
    }
    public static void printString(Printable p) {
        p.print("hello");
    }
}
