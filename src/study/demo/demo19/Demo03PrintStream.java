package study.demo.demo19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

//打印流
public class Demo03PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream(new File("E:\\project\\java\\pro\\study\\print.txt"));
        ps.println(98);
        ps.write(98);
        ps.close();
    }
}
