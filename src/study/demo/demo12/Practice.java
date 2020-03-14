package study.demo.demo12;

public class Practice {
    public static void main(String[] args) {
        //正常写法
        invokeCook((new Cook() {
            @Override
            public void makeFood() {
                System.out.println("eat!!!");
            }
        }));
        //Lambda
        invokeCook(()->{
            System.out.println("eat!!!");
        });
    }
    private static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}
