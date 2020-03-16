package study.demo.demo26_annotation;


import java.lang.annotation.*;

/**
 * 元注解
 * @Target:描述注解能够作用的位置
 * @Retention:描述注解被保留的阶段
 * @Documented:描述注解是否被抽取到api文档中
 * @Inherited:描述注解是否被子类继承
 */
@Target(value = {ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})  //表示该注解只能作用于特定
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface MyAnnotation3 {
}
