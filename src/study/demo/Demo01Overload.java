package study.demo;
// 方法重载 可以兼容不定个入参

// 参数列表不一样
// 与参数名称不一样
// 与返回值类型不一样
public class Demo01Overload {
    public static void main(String[] args) {
        int res = sum(1, 2);
        int res0 = sum(1, 4.1);
        System.out.println(res);
        System.out.println(res0);

        int res2 = sum(1, 2, 3);
        System.out.println(res2);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
    /*public static float sum(int a, int b) {
        return (float)(a + b + 0.0);
    }*/
    public static int sum(double a, double b) {
        return (int) (a + b);
    }
    public static int sum(int a, double b) {
        return (int) (a + b);
    }
    public static int sum(double a, int b) {
        return (int) (a + b);
    }
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}
