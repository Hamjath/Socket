import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{
    public static void main(String[] args){
        try {
            System.out.println("Waiting for client...");
            ServerSocket ss = new ServerSocket((87));
            Socket soc = ss.accept();
            System.out.println("Connected...");

            BufferedReader obj = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            int number_1 = obj.read();
            //int number_2 = obj.read();
            PrintWriter out = new PrintWriter(soc.getOutputStream(),true);

            int sum = number_1;
            out.println("This is: "+ sum);
            System.out.println(sum);
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}