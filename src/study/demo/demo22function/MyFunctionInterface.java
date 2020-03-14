package study.demo.demo22function;
//函数式接口 ： 有且仅有一个抽象方法的接口，称为函数式接口
//可以包含其他的公共，静态，私有方法
@FunctionalInterface
public interface MyFunctionInterface {
    public abstract void method();
}
