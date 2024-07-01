package com.example.batalhanavalix;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class HelloController {

    private Servidor servidor;
    private Cliente cliente;

    @FXML
    private Button connectButton;

    @FXML
    private TextField enderecoField;

    @FXML
    private Button playButton;

    @FXML
    private TextField posicaoField;

    @FXML
    private Button waitPlayerButton;

    @FXML
    private void conectar(ActionEvent event) {
        String endereco = enderecoField.getText();
        System.out.println("Conectando ao endereço: " + endereco);

        cliente = new Cliente("localhost", 12345);
        System.out.println("Conectado ao servidor: " + endereco);
    }

    @FXML
    private void aguardar(ActionEvent event) {
        System.out.println("Aguardando jogador...");
        servidor = new Servidor(12345);
        new Thread(() -> servidor.aguardarConexoes()).start();
    }

    @FXML
    private void play() {
    }
}
