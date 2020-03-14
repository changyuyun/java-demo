package study.demo.demo14;

import java.io.File;

// 递归读取多级目录
public class Demo01Recurison {
    public static void main(String[] args) {
        String path = "E:\\work";
        File dir = new File(path);
        printDir(dir);
    }

    private static void printDir(File dir) {
        File[] files = dir.listFiles();
        for (File file:files) {
            if (file.isFile()) {
                //只输出png文件
                String name = file.getName();
                name = name.toLowerCase();
                boolean end = name.endsWith(".png");
                if (end) {
                    System.out.println(file);
                }
            } else {
                printDir(file);
            }
        }
    }
}
