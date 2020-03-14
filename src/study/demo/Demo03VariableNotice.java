package study.demo;
//注意事项
//创建多个变量，变量名称不可重复
//byte或short，存在数据范围
//未赋值的无法直接使用
//变量作用域，方法内
//可以通过一个语句创建多个变量，不推荐
public class Demo03VariableNotice {
    public static void main(String[] args) {
        int num1 =10;
        // int num1 = 20;

        //int num4;
        //System.out.println(num4);
        int a, b, c = 10;
        a = 20;
        System.out.print(a);
    }
}
