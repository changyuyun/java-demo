package study.demo;

public class Demo02OverloadSame {
    public static void main(String[] args) {
        boolean res = isSame((byte)1, (byte)2);
        System.out.println(res);
    }

    public static boolean isSame(byte a , byte b) {
        boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }

    public static boolean isSame(short a, short b) {
        boolean same = a == b ? true : false;
        return same;
    }

    public static boolean isSame(int a, int b) {
        boolean same = a == b ? true : false;
        return same;
    }

}
