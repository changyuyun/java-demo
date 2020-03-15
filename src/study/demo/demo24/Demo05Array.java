package study.demo.demo24;

import java.util.Arrays;
//引用方法：创建数组
public class Demo05Array {
    public static int[] createArray(int length, ArrayBuilder a) {
        return a.buildArray(length);
    }

    public static void main(String[] args) {
        int[] array = createArray(10, new ArrayBuilder() {
            @Override
            public int[] buildArray(int length) {
                return new int[length];
            }
        });
        System.out.println(array.length);

        createArray(10,(int length)->{
            return new int[length];
        });
        //方法引用
        int[] array2 = createArray(10,int[]::new);
        System.out.println(array2.length);
        System.out.println(Arrays.toString(array2));
    }
}
