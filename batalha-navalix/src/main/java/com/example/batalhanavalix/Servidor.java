package com.example.batalhanavalix;

import java.io.*;
import java.net.*;

public class Servidor {
    private ServerSocket serverSocket;
    private Socket jogador2;

    public Servidor(int porta) {
        try {
            serverSocket = new ServerSocket(porta);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void aguardarConexoes() {
        try {
            System.out.println("Aguardando jogador 2...");
            jogador2 = serverSocket.accept();
            System.out.println("Jogador 2 conectado: " + jogador2.getInetAddress().getHostAddress());

            iniciarJogo();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void iniciarJogo() {
        System.out.println("Iniciando o jogo...");
    }

    public void fechar() {
        try {
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
