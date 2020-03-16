package study.demo.demo27_check;

public class Calculator {
    @Check
    public void sum() {
        System.out.println(1 + 1);
    }
    @Check
    public void sub() {
        System.out.println(1 - 1);
    }
    @Check
    public void div() {
        System.out.println(1/0);
    }

    public void show() {
        System.out.println("show......");
    }
}
