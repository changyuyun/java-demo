package study.demo.demo09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//Comparator
public class Demo01Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        //对普通类型的升序降序
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return t1 - integer;
            }
        });
        System.out.println(list);

        ArrayList<Student> list2 = new ArrayList<>();
        list2.add(new Student("e常育云", 18));
        list2.add(new Student("常育云2", 15));
        list2.add(new Student("常育云3", 17));
        list2.add(new Student("常育云4", 13));
        list2.add(new Student("a常育云5", 18));
        System.out.println(list2);
        /*Collections.sort(list2, new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                //按年龄排序
                return student.getAge() - t1.getAge();
            }
        });*/
        Collections.sort(list2, new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                //多条件排序
                int result =  student.getAge() - t1.getAge();
                if (result == 0) {
                    result = student.getName().charAt(0) - t1.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(list2);
    }
}
