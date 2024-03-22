public class BombaCombustivel {
    public java.lang.String tipoCombustivel;
    public double valorLitro;
    public int quantidadeCombustivel;

    public void abastecerPorValor(double valor) {
        System.out.println("Com o valor de " + valor + " reais foi colocado no seu veículo " + valor/valorLitro + " litros.");
        this.quantidadeCombustivel -= valor/valorLitro;
        System.out.println("Restam na bomba " + this.quantidadeCombustivel + " litros.");
    }

    public void abastecerPorLitro(int quantidadeLitros) {
        System.out.println("O valor para abastecer seu veículo com " + quantidadeLitros + " litros é de " + quantidadeLitros*valorLitro + " reais.");
        this.quantidadeCombustivel -= quantidadeLitros;
        System.out.println("Restam na bomba " + this.quantidadeCombustivel + " litros.");
    }

    public void alterarValor(double novoValor) {
        this.valorLitro = novoValor;
    }

    public void alterarCombustivel(int novoTipoCombustivel) {
        if (novoTipoCombustivel == 1) {
            this.tipoCombustivel = "Comum";
            this.quantidadeCombustivel = 400;
            alterarValor(4.5);
        } else if (novoTipoCombustivel == 2) {
            this.tipoCombustivel = "Aditivada";
            this.quantidadeCombustivel = 700;
            alterarValor(4.7);
        } else if (novoTipoCombustivel == 3) {
            this.tipoCombustivel = "Etanol";
            this.quantidadeCombustivel = 200;
            alterarValor(3.7);
        } else if (novoTipoCombustivel == 4) {
            this.tipoCombustivel = "Alcool";
            this.quantidadeCombustivel = 350;
            alterarValor(3.2);
        }
    }

    public void alterarQuantidadeCombustivel(int litros) {
        this.quantidadeCombustivel -= litros;
    }
}
