package study.demo.demo15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//复制文件
public class Demo02Copy {
    public static void main(String[] args) throws IOException {
        FileInputStream f = new FileInputStream("E:\\project\\java\\pro\\study\\src\\1.jpg");
        FileOutputStream f2 = new FileOutputStream("E:\\project\\java\\pro\\study\\src\\2.jpg");
        int len = 0;
        while ((len = f.read()) != -1) {
            f2.write(len);
        }
        f.close();
        f2.close();
        System.out.println("");
    }
}
