package study.demo.demo05;

import java.util.Scanner;

//Scanner类
//导入:除java.lang
//创建
//使用
public class Demo01Scanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入：");
        int num = scan.nextInt();
        System.out.println(num);
    }
}
