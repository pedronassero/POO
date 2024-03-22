import jdk.jshell.SourceCodeAnalysis;
import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        BombaCombustivel bomba1 = new BombaCombustivel("Comum", 4.5, 400);
        BombaCombustivel bomba2 = new BombaCombustivel("Aditivada", 4.7, 700);
        BombaCombustivel bomba3 = new BombaCombustivel("Etanol", 3.7, 200);
        BombaCombustivel bomba4 = new BombaCombustivel("Alcool", 3.2, 350);
        Scanner scanner = new Scanner(in);

        System.out.println("Qual tipo de gasolina você deseja?");
        System.out.println("1 - Comum");
        System.out.println("2 - Aditivada");
        System.out.println("3 - Etanol");
        System.out.println("4 - Alcool");
        System.out.print("Sua escolha: ");
        int tipoGasolina = scanner.nextInt();
        BombaCombustivel bombaEscolhida;

        switch (tipoGasolina) {
            case 1:
                bombaEscolhida = bomba1;
                break;
            case 2:
                bombaEscolhida = bomba2;
                break;
            case 3:
                bombaEscolhida = bomba3;
                break;
            case 4:
                bombaEscolhida = bomba4;
                break;
            default:
                System.out.println("Escolha inválida.");
                return;
        }

        System.out.println("Tipo da gasolina: " + bombaEscolhida.tipoCombustivel);
        System.out.println("Valor: " + bombaEscolhida.valorLitro);
        System.out.println("Quantidade: " + bombaEscolhida.quantidadeCombustivel);

        System.out.println(" ");
        System.out.println("Qual método você quer utilizar para abastecer?");
        System.out.println("1 - Por valor.");
        System.out.println("2 - Por litro.");
        System.out.print("Sua escolha: ");
        int metodo = scanner.nextInt();

        double valor;
        int quantidade;
        if (metodo == 1) {
            System.out.println(" ");
            System.out.println("Qual o valor do abastecimento?");
            System.out.print("Valor: ");
            valor = scanner.nextFloat();
            bombaEscolhida.abastecerPorValor(valor);
        } else {
            System.out.println(" ");
            System.out.println("Quantos litros você deseja abastecer?");
            System.out.print("Quantidade: ");
            quantidade = scanner.nextInt();
            bombaEscolhida.abastecerPorLitro(quantidade);
        }
        System.out.println(" ");
        System.out.println("Quantidade de todos os combustíveis: ");
        System.out.println("Comum: " + bomba1.quantidadeCombustivel);
        System.out.println("Aditivada: " + bomba2.quantidadeCombustivel);
        System.out.println("Etanol: " + bomba3.quantidadeCombustivel);
        System.out.println("Alcool: " + bomba4.quantidadeCombustivel);
    }
}