public class Main
{
	public static void main(String[] args) {
		Produto p1 = new Produto("Macarrao", 10.0);
		Servico s1 = new Servico("Curso de Machine Leaning", 1000.50);
		ISS iss1 = new ISS(s1);
		System.out.println("");
		IPI ipi1 = new IPI(p1);
		System.out.println("");
		System.out.println("Produto: ");
		ICMS icms1 = new ICMS(p1.valor);
		System.out.println("");
		System.out.println("Serviço: ");
		ICMS icms2 = new ICMS(s1.valor);
	}
}
