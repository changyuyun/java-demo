package study.demo.demo07;

public class Demo01String {
    // ==是进行对象的地址值的比较
    public static void main(String[] args) {
        String str = "123";
        String str2 = "123";
        char[] charArray = {'1','2','3'};
        String str3 = new String(charArray);
        System.out.println(str == str2);//true
        System.out.println(str == str3);//false
        System.out.println(str2 == str3);//false
        System.out.println(str2.equals(str3));//true

        //长度
        System.out.println(str2.length());

        //拼接
        System.out.println(str2.concat("456"));

        //获取指定索引位置的字符
        System.out.println(str2.charAt(0));

        //获取字符的索引
        System.out.println(str2.indexOf("3"));

        //截取
        System.out.println(str2.substring(1));
        System.out.println(str2.substring(1,2));

        //转换
        String str4 = "弄好啊,啊啊啊啊";
        System.out.println(str4.toCharArray());
        System.out.println(str4.getBytes());
        System.out.println(str4.replace("啊", ".."));

        //分割---》数组
        String[] arr = str4.split(",");

    }
}
