package study.demo.demo26_annotation;
//编译器注解
@SuppressWarnings("all")
public class Demo01Annotation {
    @Override
    public String toString() {
        return super.toString();
    }

    @Deprecated
    public void show() {
        System.out.println("show");
    }
}
