package study.demo.demo19;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
//序列化
public class Demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\project\\java\\pro\\study\\object_write.txt"));
        oos.writeObject(new Person("美女", 18));
        oos.close();
        //transient:瞬态关键字
    }
}
