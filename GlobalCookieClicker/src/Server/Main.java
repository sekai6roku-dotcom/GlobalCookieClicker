package Server;

import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) {
        // Creates
        CookieClicker game = new CookieClicker();
        try {
            // Opens port
            ServerSocket server = new ServerSocket(8080);
            System.out.println("Server started!");
            // Looks for player connections
            while (true) {
                // Wait until a player joins
                Socket client = server.accept();
                System.out.println("A player connected!");
            }
        } catch (Exception e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }
}
