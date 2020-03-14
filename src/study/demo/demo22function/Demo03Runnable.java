package study.demo.demo22function;
//函数式接口。使用该接口作为参数
public class Demo03Runnable {
    public static void startThread(Runnable run) {
        //开启多线程
        new Thread(run).start();
    }

    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println("开启新线程啦 "+ Thread.currentThread().getName());
            }
        });
        //Lambda
        startThread(()->{
            System.out.println("开启新线程啦 "+ Thread.currentThread().getName());
        });
        //Lambda 优化
        startThread(()-> System.out.println("开启新线程啦 "+ Thread.currentThread().getName()));
    }
}
