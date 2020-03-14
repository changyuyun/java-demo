package study.demo.demo22function;
//使用lambda优化日志案例
//Lambda:延迟加载
public class Demo02LambdaLogger {
    public static void main(String[] args) {
        String str1 = "a";
        String str2 = "b";
        String str3 = "c";
        //Lambda可以起到延迟作用
        show(2, (int level)->{
            System.out.println("测试延迟执行");
            return str1+str2+str3;
        });
    }

    public static void show(int level, MessageBuilder m) {
        if (level == 1) {
            System.out.println(m.log(level));
        }
    }
}
