import java.net.*;
import java.io.*;

class A2P7 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 5000);
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String[] messages = {"Hello", "Java", "TCP"};
        for (String msg : messages) {
            out.println(msg);
            System.out.println(in.readLine());
        }
        s.close();
    }
}
