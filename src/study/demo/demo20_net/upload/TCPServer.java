package study.demo.demo20_net.upload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9999);
        while (true) {
            Socket socket = server.accept();
            //使用多线程
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream is = socket.getInputStream();
                        File file = new File("E:\\upload");
                        if (!file.exists()) {
                            file.mkdir();
                        }
                        String filename = new Random().nextInt(999999) + ".txt";
                        FileOutputStream fos = new FileOutputStream("E:\\upload\\"+filename);
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = is.read(bytes)) != -1) {
                            fos.write(bytes,0,len);
                        }
                        socket.getOutputStream().write("上传成功".getBytes());
                        socket.close();
                        fos.close();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }

                }
            }).start();

        }

        //server.close();
    }
}
