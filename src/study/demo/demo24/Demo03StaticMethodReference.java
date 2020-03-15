package study.demo.demo24;
//通过类名引用静态的成员方法
public class Demo03StaticMethodReference {
    public static void main(String[] args) {
        int res = method(-1, new Calcable() {
            @Override
            public int calsAbs(int number) {
                return Math.abs(number);
            }
        });
        System.out.println(res);

        int res2 = method(-10, (n)->{
            return Math.abs(n);
        });
        System.out.println(res2);

        //方法引用
        int res3 = method(-10,Math::abs);
        System.out.println(res3);
    }
    public static int method(int number, Calcable c) {
        return c.calsAbs(number);
    }
}
