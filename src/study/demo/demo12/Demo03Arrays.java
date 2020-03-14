package study.demo.demo12;

import java.util.Arrays;
import java.util.Comparator;
//有参数，有返回值
public class Demo03Arrays {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("chang", 18),
                new Person("chang2", 15),
                new Person("chang4", 17),
                new Person("chang3", 3),
        };
        /*Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person person, Person t1) {
                return person.getAge() - t1.getAge();
            }
        });*/
        //Lambda
        Arrays.sort(arr,(Person o1, Person o2)->{
            return o1.getAge() - o2.getAge();
        });

        for (Person p : arr) {
            System.out.println(p);
        }
    }
}
