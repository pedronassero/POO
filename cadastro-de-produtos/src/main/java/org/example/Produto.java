package org.example;

public class Produto {

    private String tipo;
    private String descricao;
    private float peso;
    private int quantidade;
    private Medida medida;

    public Produto(String tipo, String descricao, float peso, int quantidade, Medida medida) {
        this.tipo = tipo;
        this.descricao = descricao;
        this.peso = peso;
        this.quantidade = quantidade;
        this.medida = medida;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getPeso() {
        return peso;
    }

    public int getQuantidade() {
        return quantidade;
    }
}