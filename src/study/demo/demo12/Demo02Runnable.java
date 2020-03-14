package study.demo.demo12;

public class Demo02Runnable {
    public static void main(String[] args) {
        //创建线程
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        new Thread(r).start();

        //简化代码
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();

        //Lambda
        new Thread(()->System.out.println(Thread.currentThread().getName())).start();
    }
}
