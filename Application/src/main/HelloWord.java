package main;

import java.io.*;

public class HelloWord {
    public static void main(String[] args) {
//        ServerSocket s = new ServerSocket(3200);
//        do {
//            System.out.println("Waitting for client");
//            Socket ss = s.accept();
//            System.out.println("Socket accpted");
//
//            InputStream is = ss.getInputStream();
//            BufferedReader br = new BufferedReader(new InputStreamReader(is));
//
//            OutputStream os = ss.getOutputStream();
//            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
//
//            String sentMessage = "";
//            String receivedMessage;
//            do {
//                DataInputStream data = new DataInputStream(System.in);
//                System.out.print("Sent: ");
//                sentMessage = data.readLine();
//
//                bw.write(sentMessage);
//                bw.newLine();
//                bw.flush();
//
//                receivedMessage = br.readLine();
//                System.out.println("Received: " + receivedMessage);
//
//            } while(true);
//
//
//        }
//        while(true);
        ServerGUI serverGUI = new ServerGUI();
    }
}
