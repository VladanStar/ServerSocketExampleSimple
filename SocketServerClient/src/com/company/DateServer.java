package com.company;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class DateServer {
    private static final int PORT = 9090;

    public static void main(String[] args) throws Exception {
        // write your code here
        ServerSocket serverSocket = new ServerSocket(PORT);

        System.out.println("Server is Waiting client connection");

        Socket socket = serverSocket.accept();

        System.out.println("SERVER connected from CLIENT");

        PrintWriter pw = new PrintWriter(socket.getOutputStream());
        pw.println(new Date().toString());

        System.out.println("SERVER SENT DATA FROM CLIENT");
        socket.close();
        serverSocket.close();


    }
}
