
import java.net.Socket;
import java.io.*;

public class Client {
    public static void main(String[] args){
        try {
            System.out.println("Client started.");
            Socket soc = new Socket("localhost", 87);
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter a number: ");
            int num_1 = userInput.read();

//            System.out.print("Enter a number: ");
//            int num_2 = userInput.read();

            PrintWriter out = new PrintWriter((soc.getOutputStream()),true);
            out.println(num_1);
//            out.println(num_2);

            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(in.read());


        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}