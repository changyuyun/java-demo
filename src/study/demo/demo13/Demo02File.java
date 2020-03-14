package study.demo.demo13;

import java.io.File;
import java.io.IOException;

public class Demo02File {
    public static void main(String[] args) throws IOException {
        //createFile();
        //createDir();
    }

    public static void createFile() throws IOException {
        //文件的创建
        File f = new File("a.txt");
        if (!f.exists()) {
            boolean result = f.createNewFile();
            if (result) {
                System.out.println("success!!!");
            } else {
                System.out.println("failed!!!");
            }
        } else {
            System.out.println("a.txt is exists");
        }
    }

    public static void createDir() {
        File f = new File("test");
        if (!f.exists()) {
            boolean result = f.mkdir();
            if (result) {
                System.out.println("success!");
            } else {
                System.out.println("failed!");
            }
        } else {
            System.out.println("director is exist!");
        }
    }
}
