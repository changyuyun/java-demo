package study.demo;
// 数组

//1.数组是一种引用类型
//2.数组中的多个数据，类型必须统一
//3.数组的长度在程序运行期间不可改变


import java.util.Arrays;

//1.动态初始化（制定长度）
//2.静态初始化（制定内容）
public class Demo01Array {

    public static void main(String[] args) {
        // 动态
        int[] a = new int[10];
        double[] b = new double[10];
        String[] c = new String[10];

        //静态
        int[] d = new int[]{1,2,3};
        double[] e = new double[]{};
        String[] f = new String[]{};

        System.out.println(d.length);


        //省略格式
        int[] g = {1,2,3}; //常用
        int[] h = {1,2,3,4};
        System.out.println(Arrays.toString(g));
    }

    //使用
    public static void arr() {
        int[] a = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(a));
        System.out.println(a[0]);
    }
}
