package org.example.java21.exemplo3;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class VirtualThreadServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Server listening on port 8080");

            while (true) {
                Socket clientSocket = serverSocket.accept();

                Thread.ofVirtual().start(() -> handleRequest(clientSocket));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void handleRequest(Socket clientSocket) {
        try (clientSocket) {
            // Simula o processamento da requisição
            System.out.println("Handling request from " + clientSocket);
            clientSocket.getOutputStream().write("HTTP/1.1 200 OK\r\n\r\nHello, Virtual Threads!".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
