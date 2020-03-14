package study.demo.demo05;

import java.util.Scanner;

//匿名对象作为参数
public class Demo02Anonymous {
    public static void main(String[] args) {
        //int num = new Scanner(System.in).nextInt();
        //System.out.println(num);
        methodParam(new Scanner(System.in));
    }

    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        //int num = new Scanner(System.in).nextInt();
        System.out.println(num);
    }
}
