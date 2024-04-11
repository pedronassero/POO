public abstract class Veiculo {

    private String tipo;
    private float peso;
    private float precoPorHora;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getPrecoPorHora() {
        return precoPorHora;
    }

    public void setPrecoPorHora(float precoPorHora) {
        this.precoPorHora = precoPorHora;
    }

    public abstract double precoPorClassificacao();
}
