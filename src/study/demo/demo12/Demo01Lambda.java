package study.demo.demo12;
/*
* 标准格式：
*  1.一些参数
*  2.一个箭头
*  3.一段代码
* （参数列表）-> {一些重写方法的代码}
* */
//无参数 无返回值
public class Demo01Lambda {
    public static void main(String[] args) {
        //Lambda
        new Thread(()->System.out.println(Thread.currentThread().getName())).start();
    }
}
