package study.demo.demo25_reflect;
//反射
public class Demo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取class对象的方式
        //1.Class.forName("全类名")：多用于配置文件
        Class<?> cls = Class.forName("study.demo.demo25_reflect.Person");
        System.out.println(cls);
        //2.类名.class：多用于参数的传递
        Class<Person> cls2 = Person.class;
        System.out.println(cls2);
        //3.对象.getClass：多用于对象的获取字节码的方式
        Person p = new Person();
        Class<? extends Person> cls3 = p.getClass();
        System.out.println(cls3);

        //同一个字节码文件，在程序运行过程中，只会被加载一次
        System.out.println(cls2 == cls3);
    }
}
