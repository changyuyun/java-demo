package study.demo.demo16;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

//Properties:是一个唯一和IO流相结合的集合 key,value
//store:把集合中的临时数据，持久化到硬盘中
//load:把硬盘中的保存的文件（键值对），读取到集合中使用
public class DemoProperties {
    public static void main(String[] args) throws IOException {
        // show1();
        // show2();
        show3();
    }
    //load
    private static void show3() throws IOException {
        FileReader r = new FileReader("E:\\project\\java\\pro\\study\\java-demo\\c.txt");
        Properties p = new Properties();
        p.load(r);
        Set<String> s = p.stringPropertyNames();
        for (String key:s) {
            String v = p.getProperty(key);
            System.out.println(key+"--"+v);
        }
    }

    //store
    private static void show2() throws IOException {
        Properties p = new Properties();
        p.setProperty("chang", "168");
        p.setProperty("chang2", "163");
        p.setProperty("chang3", "169");

        Set<String> set =  p.stringPropertyNames();
        FileWriter w = new FileWriter("E:\\project\\java\\pro\\study\\c.txt");
        p.store(w, "just a write");
        w.close();
    }

    //设置与读取
    private static void show1() {
        Properties p = new Properties();
        p.setProperty("chang", "168");
        p.setProperty("chang2", "163");
        p.setProperty("chang3", "169");
        //将集合中的key取出，存到一个Set集合中
        Set<String> s = p.stringPropertyNames();
        for (String a:s) {
            String v = p.getProperty(a);
            System.out.println(v);
        }
    }


}
