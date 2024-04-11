public class Furgao extends Veiculo {

    public Furgao(String tipo, float peso) {
        setTipo(tipo);
        setPeso(peso);
    }

    public boolean classificaFurgao() {
        if (getPeso() <= 3000) {
            setTipo("Furgão não carregado");
            return true;
        } else if (getPeso() > 3000 && getPeso() <= 6000) {
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
