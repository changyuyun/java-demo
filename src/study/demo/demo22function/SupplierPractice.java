package study.demo.demo22function;

import java.util.Arrays;
import java.util.function.Supplier;

//Supplier接口练习
//获取int类型数组中的最大值
public class SupplierPractice {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,10,8};
        //Arrays.sort(arr);
        int ret = getMax(new Supplier<Integer>() {
            @Override
            public Integer get() {
                int max = arr[0];
                for (int item:arr) {
                    if (item > max) {
                        max = item;
                    }
                }
                return max;
            }
        });

        System.out.println(Arrays.toString(arr));
        System.out.println(ret);
    }

    public static Integer getMax(Supplier<Integer> sup) {
        return sup.get();
    }
}
