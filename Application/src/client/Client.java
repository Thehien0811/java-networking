package client;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("localhost", 3200);
        String sentMessage = "";
        String receivedMessage;
        InputStream is = s.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        OutputStream os = s.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        do {
            DataInputStream data = new DataInputStream(System.in);
            System.out.print("Sent: ");
            sentMessage = data.readLine();

            bw.write(sentMessage);
            bw.newLine();
            bw.flush();

            receivedMessage = br.readLine();
            System.out.println("Received: " + receivedMessage);


        } while(true);
    }
}
