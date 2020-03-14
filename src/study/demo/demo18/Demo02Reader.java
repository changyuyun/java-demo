package study.demo.demo18;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//字节转换流
public class Demo02Reader {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\project\\java\\pro\\study\\f.txt");
        //字节转换流
        InputStreamReader isr = new InputStreamReader(fis, "GBK");
        int len;
        while ((len = isr.read()) != -1) {
            System.out.println((char)len);
        }
        String charset = isr.getEncoding();
        System.out.println(charset);
        isr.close();
        fis.close();
    }
}
