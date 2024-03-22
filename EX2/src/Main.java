import jdk.jshell.SourceCodeAnalysis;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BombaCombustivel bomba1 = new BombaCombustivel();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual tipo de gasolina você deseja?");
        System.out.println("1 - Comum");
        System.out.println("2 - Aditivada");
        System.out.println("3 - Etanol");
        System.out.println("4 - Alcool");
        System.out.print("Sua escolha: ");
        int gasolina = scanner.nextInt();
        bomba1.alterarCombustivel(gasolina);
        System.out.println("Tipo da gasolina: " + bomba1.tipoCombustivel);
        System.out.println("Valor: " + bomba1.valorLitro);
        System.out.println("Quantidade: " + bomba1.quantidadeCombustivel);


        System.out.println("Qual método você quer utilizar para abastecer?");
        System.out.println("1 - Por valor.");
        System.out.println("2 - Por litro.");
        System.out.print("Sua escolha: ");
        int metodo = scanner.nextInt();

        double valor;
        int quantidade;
        if (metodo == 1) {
            System.out.println("Qual o valor do abastecimento?");
            System.out.print("Valor: ");
            valor = scanner.nextFloat();
            bomba1.abastecerPorValor(valor);
        } else {
            System.out.println("Quantos litros você deseja abastecer?");
            System.out.print("Quantidade: ");
            quantidade = scanner.nextInt();
            bomba1.abastecerPorLitro(quantidade);
        }

    }
}