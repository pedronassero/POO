public class Caminhonete extends Veiculo {

    public Caminhonete(String tipo, float peso) {
        setTipo(tipo);
        setPeso(peso);
    }

    public boolean classificaCaminhonete() {
        if (getPeso() < 3000) {
            setTipo("Caminhonete não carregada");
            return true;
        } else if (getPeso() > 3000 && getPeso() <= 6000) {
            setTipo("Caminhonete carregada");
            return true;
        } else {
            System.out.println("Desculpe, mas sua Caminhonete é pesada demais para estacionar na garagem.");
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
