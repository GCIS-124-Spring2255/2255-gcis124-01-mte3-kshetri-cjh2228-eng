// Exam: 2255 GCIS 124, Mid Term Exam #3, Question 2
// Filename: KnockKnockServer.java (inside knockknock package)

package mte3.knockknock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import mte3.knockknock2.Server;

public class KnockKnockServer {
    public static int PORT = 54322;

    public static void receiveAndSend(Scanner scanner,String message,PrintWriter writer,boolean concat) throws IOException {
        
        
        // 

    } // receiveAndSend() method closed
    
    public static void main(String args[]) throws IOException {
        try {ServerSocket server = new ServerSocket(PORT);
            Socket client = server.accept();
            PrintWriter out = new PrintWriter(client.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
            
                String received = in.readLine();
                String sent = "Who's there?";
                out.println(sent);
                out.flush();
                System.out.println("Sent: " + sent + ", Received: " + received);
                String received2 = in.readLine();
                String sent2 = received2 + ", who?";
                out.println(sent2);
                out.flush();
                System.out.println("Sent: " + sent2 + ", Received: " + received2);
                String punchline = in.readLine();
                String sent3 = "HAHAHAHA";
                out.println(sent3);
                out.flush();
                System.out.println("Sent: " + sent3 + ", Received: " + punchline);
                server.close();
                in.close();
                out.close();

        } catch (IOException e) {
            System.out.println("Waiting for connection");
        }
        // 
        // 
        // 
    
    } // main() method closed
}