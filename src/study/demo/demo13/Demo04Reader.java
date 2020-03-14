package study.demo.demo13;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
//读取字符 FileReader:文件字符输入流
public class Demo04Reader {
    public static void main(String[] args) throws IOException {
        FileReader r = new FileReader("E:\\project\\java\\pro\\study\\a.txt");
        int len;
        while ((len = r.read()) != -1) {
            System.out.println((char) len);
        }
        r.close();
    }
}
