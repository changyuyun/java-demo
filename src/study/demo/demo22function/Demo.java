package study.demo.demo22function;
//函数式接口：一般可以作为方法的参数和返回值类型
public class Demo {
    public static void main(String[] args) {
        //1.传递实现类对象
        show(new MyFunctionInterfaceImpl());
        //2.方法参数式一个接口
        show(new MyFunctionInterface() {
            @Override
            public void method() {
                System.out.println("interface 重写");
            }
        });
        //方法参数是一个函数式接口，lambda表达式
        show(()->{
            System.out.println("interface lambda表达式");
        });

        //lambda 简化
        show(()->System.out.println("interface lambda表达式 简化"));

    }
    //定义一个方法，参数使用函数式接口
    public static void show(MyFunctionInterface f) {
        f.method();
    }
}
