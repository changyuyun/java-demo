package study.demo.demo13;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

//文件过滤器的使用
public class Demo04FileFilter {
    public static void main(String[] args) {
        File f = new File("E:\\work");
        printDir(f);
    }

    private static void printDir(File fileObj) {
        //1.使用匿名类 FileFilter
        /*File[] files = fileObj.listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                if (file.isDirectory()) {
                    return true;
                } else {
                    return file.getName().toLowerCase().endsWith(".txt");
                }
            }
        });*/
        //2.lambda
        File[] files = fileObj.listFiles((File file)->{
            if (file.isDirectory()) {
                return true;
            } else {
                return file.getName().toLowerCase().endsWith(".txt");
            }
        });
        //3.使用匿名类 FilenameFilter
        /*File[] files = fileObj.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File file, String s) {
                return new File(file, s).isDirectory() || s.toLowerCase().endsWith(".txt");
            }
        });*/
        //4.lambda
        /*File[] files = fileObj.listFiles((File file, String s)->{
            return new File(file, s).isDirectory() || s.toLowerCase().endsWith(".txt");
        });*/
        //5.使用继承接口重写
        //File[] files = fileObj.listFiles(new FileFilterImpl());
        for (File file : files) {
            if (file.isFile()) {
                System.out.println(file);
            } else {
                printDir(file);
            }
        }
    }
}
