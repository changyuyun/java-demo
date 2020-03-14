package study.demo.demo20_net.upload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        //创建socket对象
        Socket socket = new Socket("127.0.0.1", 9999);
        //本地文件输入流
        FileInputStream fi = new FileInputStream("E:\\project\\java\\pro\\study\\e.txt");
        //获取网络输出流
        OutputStream os = socket.getOutputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fi.read(bytes)) != -1) {
            os.write(bytes, 0, len);
        }
        socket.shutdownOutput();
        InputStream is = socket.getInputStream();
        while ((len = is.read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }
        fi.close();
        socket.close();
    }
}
