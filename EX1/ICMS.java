public class ICMS {
    
    public ICMS(double valor) {
        calcularICMS(valor);
    }
    
    public void calcularICMS(double valor) {
        System.out.println("Preço Original: " + valor);
        System.out.println("Taxa ICMS: 17%");
        System.out.println("Valor total: " + valor * 1.17);
    }
}