package study.demo.demo13;

import java.io.FileWriter;
import java.io.IOException;
//FileWriter:字符输出流
public class Demo05Writer {
    public static void main(String[] args) throws IOException {
        FileWriter w = new FileWriter("E:\\project\\java\\pro\\study\\b.txt", true);
        String str = "你好中国！";
        w.append(str);
        w.write(str);
        w.close();
        /*for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            w.append(str.charAt(i));
        }
        w.close();*/
    }
}
