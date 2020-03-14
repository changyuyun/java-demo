package study.demo.demo18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo02Writer {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\project\\java\\pro\\study\\f.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos, "GBK");
        osw.write("你好啊 哈哈哈哈哈哈哈哈哈");
        osw.close();
        fos.close();
    }
}
