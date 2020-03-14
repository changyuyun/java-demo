package study.demo.demo18;

import java.io.*;
//文件转码
//将gbk编码的文件转换为utf8编码的文件
public class Practice {
    public static void main(String[] args) throws IOException {
        //读取
        FileInputStream fis = new FileInputStream("E:\\project\\java\\pro\\study\\f.txt");
        InputStreamReader isr = new InputStreamReader(fis,"gbk");
        //写入
        FileOutputStream fos = new FileOutputStream("E:\\project\\java\\pro\\study\\f_utf8.txt");
        OutputStreamWriter osw = new OutputStreamWriter(fos,"utf8");
        int len;
        while ((len = isr.read()) != -1) {
            System.out.println((char)len);
            osw.write(len);
        }
        isr.close();
        fis.close();

        osw.close();
        fos.close();

    }
}
