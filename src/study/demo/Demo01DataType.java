package study.demo;
//数据类型不一样时，会类型转换
/*
自动类型转换（隐式）
    1.特点：代码不需要进行特殊处理，自动完成
    2.规则：数据范围从小到大
类型转换 （强制）
    1.有可能产生精度损失，溢出
 */
public class Demo01DataType {
    public static void main(String[] args) {
        //隐式
        System.out.println(3.14);

        long num1 = 100;
        System.out.println(num1);

        double num2 = 2.5F;
        System.out.println(num2);

        float num3 = 30L;
        System.out.println(num3);

        //强制
        int num = (int)100L;
        System.out.println(num);

        int num0 = (int)6000000000L;
        System.out.println(num0);

        int num00 = (int)3.99;
        System.out.println(num00);

        char zifu = 'a';
        System.out.println(zifu + 1); // 98
    }
}
