public class Carro extends Veiculo {

    public Carro(String tipo, float peso) {
        this.setTipo(tipo);
        this.setPeso(peso);
    }

    @Override
    public double precoPorClassificacao() {
        if (getTipo() == "Carro de passeio hatchback") {
            return 13;
        } else if (getTipo() == "Carro de passeio sedan") {
            return 15;
        } else {
            return 20;
        }
    }
}
