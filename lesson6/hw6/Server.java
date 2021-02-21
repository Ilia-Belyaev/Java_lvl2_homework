package JAVA_LEVEL_2.Java_lvl2_homework.git.lesson6.hw6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args){
        myServer();
    }
    public static void myServer(){
        try {
            ServerSocket serverSocket = new ServerSocket(8180);
            System.out.println("Server is started...");
            try (
                    Socket socket = serverSocket.accept();
                    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintWriter out = new PrintWriter(socket.getOutputStream());
                    Scanner serverscanner = new Scanner(System.in);
            ){
                System.out.println("Client is connected");
                out.println("Hello!");
                out.flush();
                String message = "";
                Thread serverThread = new Thread(() -> {
                    String clientMessage = "";
                    while (!socket.isClosed()) {
                        clientMessage = serverscanner.nextLine();
                        out.println(clientMessage);
                        out.flush();
                    }
                });
                serverThread.start();
                do{
                    message = in.readLine();
                    System.out.println(message);
                }while(!message.equalsIgnoreCase("stop"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
