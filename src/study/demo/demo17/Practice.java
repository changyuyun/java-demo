package study.demo.demo17;

import java.io.*;
import java.util.HashMap;

//对文件中的文本按序号升序排序
public class Practice {
    public static void main(String[] args) throws IOException {
        //创建HashMap，用于存储结果
        HashMap<Integer, String> hm = new HashMap<>();
        //创建文本输入流
        FileReader fr = new FileReader("E:\\project\\java\\pro\\study\\d.txt");
        //创建输入字符缓存流
        BufferedReader br = new BufferedReader(fr);
        String str;
        while ((str = br.readLine()) != null) {
            //处理字符串
            String num = str.substring(0,1);
            String content = str.substring(2);
            //System.out.println(num+"==="+content);
            int key = Integer.parseInt(num);
            hm.put(key,content);
        }
        System.out.println(hm);
        //遍历 写入到新文件中
        FileWriter fw = new FileWriter("E:\\project\\java\\pro\\study\\e.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        for (Integer key:hm.keySet()) {
            String value = hm.get(key);
            System.out.println(key+"."+value);
            bw.write(key+"."+value);
            bw.newLine();
        }
        br.close();
        fr.close();
        bw.close();
        fw.close();
    }
}
