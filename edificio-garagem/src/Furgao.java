public class Furgao extends Veiculo {

    private float volume;

    public Furgao(String tipo, float peso, float volume) {
        setTipo(tipo);
        setPeso(peso);
        this.volume = volume;
    }

    public boolean classificaFurgao() {
        if (getPeso() <= 3000 && volume <= 18) {
            setTipo("Furgão não carregado");
            return true;
        } else if (getPeso() > 3000 && getPeso() <= 6000 && volume <= 18) {
            setTipo("Furgão carregado");
            return true;
        } else {
            System.out.println("Desculpe, mas seu Furgão é pesado demais para estacionar na garagem.");
            return false;
        }
    }

    @Override
    public double precoPorClassificacao() {
        if (getPeso() <= 3000) {
            return 25;
        } else {
            return 50;
        }
    }
}
