package study.demo.demo25_reflect;

public class Person {
    private String name;
    private int age;
    public int sex;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void test() {
        System.out.println("test ok");
    }

    private void testAnother(String str) {
        System.out.println(str);
    }

    public void eat() {
        System.out.println("eat.......");
    }
}
