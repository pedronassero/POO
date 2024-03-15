public class ISS {
 
    public ISS(Servico servico) {
        calculaImposto(servico.valor);
    }
    
    public void calculaImposto(double valorServico) {
        System.out.println("Preço Original: " + valorServico);
        System.out.println("Taxa ISS: 4,6%");
        System.out.println("Valor total: " + valorServico * 1.046);
    }
}