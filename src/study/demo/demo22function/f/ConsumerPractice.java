package study.demo.demo22function.f;

import java.util.Arrays;
import java.util.function.Consumer;

//Consumer练习
public class ConsumerPractice {
    public static void main(String[] args) {
        String[] arr = {"迪丽热巴#女", "古力娜扎#男"};
        printInfo(arr, (message)->{
            String[] info = message.split("#");
            System.out.println("姓名：" + info[0]);
            },(message)->{
            String[] info = message.split("#");
            System.out.println("性别：" + info[1]);
        });
    }

    public static void printInfo(String[] arr, Consumer<String> con1, Consumer<String> con2) {
        for (String message:arr) {
            con1.andThen(con2).accept(message);
        }
    }
}
