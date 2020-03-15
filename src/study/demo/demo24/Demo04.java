package study.demo.demo24;
//构造方法引用
public class Demo04 {
    public static void method(String name, PersonBuilder p) {
        Person person = p.builderPerson(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        method("mr.chang", (String name)->{
            return new Person(name);
        });
        //方法引用 构造方法
        method("mr.chang", Person::new);
    }
}
