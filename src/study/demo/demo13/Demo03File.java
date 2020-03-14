package study.demo.demo13;

import java.io.File;
// 遍历目录
public class Demo03File {
    public static void main(String[] args) {
        String path = "C:\\Users\\chang\\Desktop\\附-教程配套教学演示素材\\A篇B篇随堂素材";
        File f = new File(path);
        // String[] lists = f.list();
        /*for (String list:lists) {
            File f2 = new File(path + "\\" + list);
            if (f2.isDirectory()) {
                System.out.println(list + " is dir");
            } else {
                System.out.println(list + " is file");
            }
        }*/
        File[] lists = f.listFiles();
        for (File list:lists) {
            System.out.println(list);
        }

    }
}
