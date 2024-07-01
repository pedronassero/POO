package com.example.batalhanavalix;

import java.io.*;
import java.net.*;

public class Cliente {
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;

    public Cliente(String endereco, int porta) {
        try {
            socket = new Socket(endereco, porta);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void fechar() {
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
