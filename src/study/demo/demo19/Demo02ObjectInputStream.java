package study.demo.demo19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
//反序列化
public class Demo02ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\project\\java\\pro\\study\\object_write.txt"));
        Object o = ois.readObject();
        ois.close();
        System.out.println(o);
        Person p = (Person) o;
        System.out.println(p.getName());
    }
}
