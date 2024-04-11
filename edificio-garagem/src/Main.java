import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continua = true;
        while (continua) {
            System.out.println("Escreva o tipo do seu veículo");
            System.out.println("- Motocicleta");
            System.out.println("- Carro");
            System.out.println("- Caminhonete");
            System.out.println("- Furgão");
            System.out.println("- SAIR");
            String choice = scanner.nextLine();

            if (Objects.equals(choice, "Motocicleta")) {
                System.out.println("Qual o peso de sua Motocicleta?");
                float pesoMotocicleta = scanner.nextFloat();
                scanner.nextLine();
                Motocicleta motocicleta = new Motocicleta(choice, pesoMotocicleta);
                if (motocicleta.classificaMotocicleta()) {
                    System.out.println("Quantas horas você irá ficar com sua Motocicleta estacionada na garagem?");
                    int horas = scanner.nextInt();
                    System.out.println("O valor total a ser pago é de R$" + motocicleta.precoPorClassificacao() * horas + " reais");
                }
            } else if (Objects.equals(choice, "Carro")) {
                System.out.println("Escreva o modelo do carro.");
                System.out.println("- Carro de passeio hatchback");
                System.out.println("- Carro de passeio sedan");
                System.out.println("- SUV");
                String modelo = scanner.nextLine();
                System.out.println("Qual o peso do seu carro?");
                float pesoCarro = scanner.nextFloat();
                scanner.nextLine();
                if (pesoCarro > 2000) {
                    System.out.println("Seu veículo terá que ser classificado como Furgão devido ao peso dele.");
                    Furgao furgao = new Furgao("Furgão", pesoCarro);
                    if (furgao.classificaFurgao()) {
                        System.out.println("Quantas horas você irá ficar com seu Furgão estacionado na garagem?");
                        int horas = scanner.nextInt();
                        System.out.println("O valor total a ser pago é de R$" + furgao.precoPorClassificacao() * horas + " reais");
                    }
                } else {
                    Carro carro = new Carro(modelo, pesoCarro);
                    System.out.println("Quantas horas você irá ficar com seu Carro estacionado na garagem?");
                    int horas = scanner.nextInt();
                    System.out.println("O valor total a ser pago é de R$" + carro.precoPorClassificacao() * horas + " reais");
                }
            } else if (Objects.equals(choice, "Caminhonete")) {
                System.out.println("Qual o peso de sua Caminhonete?");
                float pesoCaminhonete = scanner.nextFloat();
                scanner.nextLine();
                Caminhonete caminhonete = new Caminhonete(choice, pesoCaminhonete);
                if (caminhonete.classificaCaminhonete()) {
                    System.out.println("Quantas horas você irá ficar com sua Caminhonete estacionada na garagem?");
                    int horas = scanner.nextInt();
                    System.out.println("O valor total a ser pago é de R$" + caminhonete.precoPorClassificacao() * horas + " reais");
                }
            } else if (Objects.equals(choice, "Furgão")) {
                System.out.println("Qual o peso de seu Furgão?");
                float pesoFurgao = scanner.nextFloat();
                scanner.nextLine();
                Furgao furgao = new Furgao(choice, pesoFurgao);
                if (furgao.classificaFurgao()) {
                    System.out.println("Quantas horas você irá ficar com seu Furgão estacionado na garagem?");
                    int horas = scanner.nextInt();
                    System.out.println("O valor total a ser pago é de R$" + furgao.precoPorClassificacao() * horas + " reais");
                }
            } else if (Objects.equals(choice, "SAIR")) {
                continua = false;
            }
        }
    }
}