public class BombaCombustivel {
    public java.lang.String tipoCombustivel;
    public double valorLitro;
    public int quantidadeCombustivel;

    public BombaCombustivel(String tipoCombustivel, double valorLitro, int quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

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

    //Função não está sendo utilizada nesse exercício pois no exercício anterior era usado apenas um objeto bomba.
    //Nesse exercício, como foi criado 4 objetos para bombas diferentes, o usuário não precisa trocar o tipo da bomba para comprá-la, apenas precisa escolher a bomba
    //que quer utilizar.
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
            this.tipoCombustivel = "Disesel";
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
