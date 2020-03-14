package study.demo.demo12;
//有参数 有返回
public class Demo04Calculator {
    public static void main(String[] args) {
        invokeCalc(1, 8, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });
        invokeCalc(1,8,(int a, int b)->{
            return a + b;
        });
        invokeCalc(1,10,(int a, int b)->a+b);
    }

    private static void invokeCalc(int a, int b, Calculator cal) {
        int result = cal.calc(a, b);
        System.out.println(result);
    }
}
