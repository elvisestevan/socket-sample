import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class SocketSample {

    public static void main (String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(9342);
        System.out.println("Servidor socket iniciado na porta");

        while (true) {
            Socket client = serverSocket.accept();
            Scanner entrada = new Scanner(client.getInputStream());
            while(entrada.hasNextLine()){
                System.out.println(entrada.nextLine());
            }
        }

    }

}
