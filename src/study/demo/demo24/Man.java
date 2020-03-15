package study.demo.demo24;

public class Man extends Human{
    @Override
    public void sayHello() {
        //super.sayHello();
        System.out.println("i am man");
    }

    public void method(Greetable g) {
        g.greet();
    }

    public void show() {
        method(()->{
            Human h = new Human();
            h.sayHello();
        });

        //子父类关键字，使用super
        method(()->{
            this.sayHello();
            super.sayHello();
        });
        //方法引用
        method(super::sayHello);
    }

    public static void main(String[] args) {
        new Man().show();
    }
}
