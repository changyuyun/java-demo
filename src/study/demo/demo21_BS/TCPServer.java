package study.demo.demo21_BS;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建socket
        ServerSocket server = new ServerSocket(8080);
        while (true) {
            //获取请求的客户端
            Socket socket = server.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        //获取客户端请求信息
                        InputStream is = socket.getInputStream();
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        String line = br.readLine();
                        String[] arr = line.split(" ");
                        String htmlpath = arr[1].substring(1);
                        FileInputStream fis = new FileInputStream(htmlpath);
                        OutputStream os = socket.getOutputStream();

                        os.write("HTTP/1.1 200 ok\r\n".getBytes());
                        os.write("Content-Type:text/html\r\n".getBytes());
                        os.write("\r\n".getBytes());

                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = fis.read(bytes)) != -1) {
                            os.write(bytes, 0, len);
                        }

                        fis.close();
                        socket.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            }).start();

        }

        //server.close();
    }

}
