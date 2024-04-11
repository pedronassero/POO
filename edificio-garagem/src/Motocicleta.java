public class Motocicleta extends Veiculo {

    public Motocicleta(String tipo, float peso) {
        this.setTipo(tipo);
        this.setPeso(peso);
    }

    public boolean classificaMotocicleta() {
        if (getPeso() <= 100) {
            this.setTipo("Motocicleta leve");
            return true;
        } else if (getPeso() > 100 && getPeso() < 300) {
            this.setTipo("Motocicleta padrão");
            return true;
        } else if (getPeso() == 300) {
            this.setTipo("Motocicleta pesada");
            return true;
        } else {
            System.out.println("Desculpe, mas sua Motocicleta é pesada demais para estacionar na garagem.");
            return false;
        }
    }


    @Override
    public double precoPorClassificacao() {
        if (getPeso() <= 100) {
            return 2;
        } else if (getPeso() > 100 && getPeso() < 300) {
            return 4;
        } else {
            return 10;
        }
    }
}
