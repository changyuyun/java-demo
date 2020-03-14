package study.demo.demo15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

//IO：内存为第一人称
//i:input：硬盘数据到内存
//o:output：内存数据到硬盘
//流：数据（字符，字节） 1个字符=2个字节 1个字节=8个二进制位
public class Demo01IO {
    public static void main(String[] args) throws IOException {
        testInputStream2();
    }
    //内存数据写入文件中
    private static void testOutputStream() throws IOException {
        FileOutputStream f = new FileOutputStream("./a.txt", true);
        //f.write(97);
        //f.write(98);
        //byte[] b = {65,66,67,68,69};
        //f.write(b);
        //f.write(b,1,2);
        //将字符写入文件中
        String s = "你好";
        byte[] a = s.getBytes();//转为字节数组
        f.write(a);
        f.write("\r\n".getBytes());//换行
        System.out.println(Arrays.toString(a));
        f.close();
    }
    //文件读取到内存中
    private static void testInputStream() throws IOException {
        FileInputStream f = new FileInputStream("./a.txt");

        int len = 0;
        //一次读取一个字节
        while ((len = f.read()) != -1) {
            System.out.println((char)len);
        }
        f.close();
    }
    //一次读取多个
    private static void testInputStream2() throws IOException {
        FileInputStream f = new FileInputStream("./a.txt");
        //byte[] b = new byte[2];
        /*int len = f.read(b);
        System.out.println(len);
        System.out.println(Arrays.toString(b));
        System.out.println(new String(b));*/
        int len = 0;
        byte[] b = new byte[1024];
        while ((len = f.read(b)) != -1) {
            System.out.println(new String(b, 0, len));
        }
        f.close();
    }

}
