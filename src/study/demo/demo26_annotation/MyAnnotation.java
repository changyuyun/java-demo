package study.demo.demo26_annotation;

public @interface MyAnnotation {
    //public abstract String show1();
    int age();
    String name();
    String school() default "";
    Person per();
    String[] arr();
    MyAnnotation2 anno2();
}
