package study.demo.demo06;

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {
        Random r = new Random();
        int res = r.nextInt(3);
        System.out.println(res);
    }
}
