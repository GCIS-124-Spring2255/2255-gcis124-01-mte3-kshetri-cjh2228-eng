// Exam: 2255 GCIS 124, Mid Term Exam #3, Question 2
// Filename: KnockKnockClient.java (inside knockknock package)

package mte3.knockknock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

public class KnockKnockClient {
    public static int PORT = 54322;
    public static String SERVER = "localhost";

    public static void sendAndReceive(PrintWriter writer, String message, Scanner scanner) throws IOException {
        
        
        
        
        // 
        // 
        // 

    } // sendAndReceive() method closed
    

    public static void joke(String who,String punchLine) throws IOException {
        Socket socket = new Socket("localhost", PORT);
        PrintWriter out = new PrintWriter(socket.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String sent1 = "Knock, Knock";
        out.println(sent1);
        out.flush();
        String received1 = in.readLine();
        System.out.println("Sent: " + sent1 + ", Received: " + received1);
        out.println(who);
        out.flush();
        String received2 = in.readLine();
        System.out.println("Sent: " + who + ", Received: " + received2);
        out.println(punchLine);
        out.flush();
        String received3 = in.readLine();
        System.out.println("Sent: " + punchLine + ", Received: " + received3);
        socket.close();
        out.close();
        in.close();
       

    } // joke() method closed

    public static void main(String[] args) throws IOException {

        String[][] jokes = {{"Tank","You're welcome!"},
                            {"Nobel","Nobel...that's why I knocked!"},
                            {"Says","Says me!"},
                            {"Hawaii","I'm good. Hawaii you?"},
                            {"Lettuce","Lettuce in, it's cold out here!"},
                            {"Cow says","No, a cow says moooooo!"},
                            {"Otto","Otto know. I forgot."}
                        };
        int i = new Random().nextInt(jokes.length);
        joke(jokes[i][0],jokes[i][1]);

    } // main() method closed

    // hint: please run KnockKnockServer first and then run KnockKnockClient

} // KnockKnockClient { } class closed