package JAVA_LEVEL_2.Java_lvl2_homework.git.lesson7.lection7.server.src.main.java;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Server {
    private List<ClientHandler> clients;
    private AtomicInteger numero = new AtomicInteger(1);

    public Server() {
        this.clients = new ArrayList<>();
        try(ServerSocket serverSocket = new ServerSocket(8189)) {
            System.out.println("Server is listening on 8189");
            while(true) {
                Socket socket = serverSocket.accept();
                new ClientHandler(numero.getAndIncrement(), this, socket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void broadcastMessage(String message) {
        for(ClientHandler client: clients) {
            client.sendMessage(message);
        }
    }

    public void broadcastClientsList() {
        StringBuilder sb = new StringBuilder(15* clients.size());
        sb.append("/clients ");
        for(ClientHandler o: clients){
            sb.append(o.getNickname()).append(" ");
        }
        String out = sb.toString();
        broadcastMessage(out);
    }

    public void subscribe(ClientHandler client) {
        clients.add(client);
        broadcastClientsList();
    }

    public void unsubscribe(ClientHandler client) {
        clients.remove(client);
        broadcastClientsList();
    }
}
