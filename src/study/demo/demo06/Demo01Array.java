package study.demo.demo06;
//对象数组
//存储Person对象
//任何数据类型都可作为数组中的元素
public class Demo01Array {
    //int[] a = {};
    public static void main(String[] args) {
        Person[] array = new Person[3];

        Person one = new Person("迪丽热巴", 15);
        Person two = new Person("迪丽热巴2", 152);
        Person three = new Person("迪丽热巴3", 153);

        // 将one当中的地址值复制到0号元素的位置
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        Person person = array[1];
        System.out.println(person.getName());
    }
}
