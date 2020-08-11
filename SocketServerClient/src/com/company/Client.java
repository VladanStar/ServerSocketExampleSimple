package com.company;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {


    public static void main(String[] args) throws Exception {
        // write your code here
        Socket socket = new Socket("localhost", 9090);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String str = br.readLine();

        JOptionPane.showMessageDialog(null, str);
        socket.close();
        br.close();
    }
}
