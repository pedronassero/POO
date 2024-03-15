public class IPI {
    
    public IPI(Produto produto) {
        calcularIPI(produto.valor);
    }
    
    public void calcularIPI(double valorProduto) {
        System.out.println("Preço Original: " + valorProduto);
        System.out.println("Taxa IPI: 25%");
        System.out.println("Valor total: " + valorProduto * 1.25);
    }
}