package Server;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class PlayerHandler implements Runnable {

    private Socket playerSocket;
    private CookieClicker game;

    public PlayerHandler(Socket socket, CookieClicker game) {
        playerSocket = socket;
        this.game = game;
    }

    @Override
    public void run() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(playerSocket.getInputStream()));
        } catch (IOException e) {
            System.out.println("Error Occured" + e.getMessage());
        }
    }
}
