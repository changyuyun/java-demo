package study.demo.demo13;

import java.io.File;

//File类
public class Demo01File {
    public static void main(String[] args) {
        String path = "E:\\work";
        File f = new File(path);
        if (f.isDirectory()) {
            String[] s = f.list();
            for (int i = 0; i < s.length; i++) {
                File f2 = new File(path + "\\" + s[i]);
                if (f2.isDirectory()) {
                    System.out.println(s[i] + " is a directory");
                } else {
                    System.out.println(s[i] + " is a file");
                }
            }
            System.out.println(s);
        } else {
            System.out.println(path+" is not a directory");
        }

    }
}
