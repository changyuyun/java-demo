package study.demo.demo26_annotation;
//自定义注解 适用示例
@MyAnnotation(age = 12, name = "Mr.chang", per = Person.P1, anno2 = @MyAnnotation2, arr = {"1","2","3"})
public class Demo02Annotation {
    public void test() {

    }
}
