package study.demo.demo17;

import java.io.*;

//BufferedStream
public class Demo01Buffer {
    public static void main(String[] args) throws IOException {
        //show1();
        //show2();
        show3();
        //show4();
    }
    //BufferedOutputStream
    private static void show1() throws IOException {
        FileOutputStream f = new FileOutputStream("E:\\project\\java\\pro\\study\\d.txt");
        //创建一个字节缓存输出流
        BufferedOutputStream bo = new BufferedOutputStream(f);
        //byte[] c = {95,96,97,98};
        String str = "我是中国人";
        bo.write(str.getBytes());
        bo.close();
        f.close();
    }
    //BufferedInputStream
    private static void show2() throws IOException {
        FileInputStream f = new FileInputStream("E:\\project\\java\\pro\\study\\d.txt");
        //字节缓存输入流
        BufferedInputStream bi = new BufferedInputStream(f);
        /*int len = 0;
        while ((len = bi.read()) != -1) {
            System.out.println(len);
        }*/
        byte[] b = new byte[1024];
        int len = 0;
        while ((len = bi.read(b)) != -1) {
            System.out.println(new String(b,0,len));
        }
        bi.close();
        f.close();
    }
    //BufferedReader
    private static void show3() throws IOException {
        FileReader fr = new FileReader("E:\\project\\java\\pro\\study\\d.txt");
        BufferedReader br = new BufferedReader(fr);
        /*int len = 0;
        while ((len = br.read()) != -1) {
            System.out.println((char)len);
        }*/
        /*char[] c = new char[1024];
        int len = 0;
        while ((len = br.read(c)) != -1) {
            System.out.println(c);
        }*/
        //按行读取
        //String line = br.readLine();
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
        fr.close();
    }
    //BufferedWrite
    private static void show4() throws IOException {
        FileWriter fw = new FileWriter("E:\\project\\java\\pro\\study\\d.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        char[] c = {'我','爱','你'};
        //bw.write("我爱你");
        bw.write(c);
        bw.newLine();
        bw.close();
        fw.close();
    }



}
