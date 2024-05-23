package org.example;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Connection conexao = Conexao.conectarBD();
        Scanner scanner = new Scanner(System.in);

        if (conexao != null) {
            try {
                Conexao.criarTabela(conexao);

                boolean programa = true;
                while (programa) {
                    System.out.println("Bem vindo(a) ao gerenciador de estoque!");
                    System.out.println("O que deseja fazer?");
                    System.out.println("1 * Adicionar produto");
                    System.out.println("2 * Deletar produto");
                    System.out.println("3 * Editar produto");
                    System.out.println("4 * Ver produtos");
                    System.out.println("5 * Sair");
                    System.out.print("Opção: ");
                    int opcao = scanner.nextInt();
                    scanner.nextLine();

                    switch (opcao) {
                        case 1:
                            System.out.print("Tipo do produto (informatica, limpeza, casa, decoracao, etc): ");
                            String tipo = scanner.nextLine();
                            System.out.print("Descrição do produto: ");
                            String descricao = scanner.nextLine();
                            System.out.print("Peso do produto: ");
                            float peso = scanner.nextFloat();
                            System.out.print("Quantidade do produto: ");
                            int quantidade = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Medida do produto (METRO, METRO_QUADRADO, LITRO OU KG): ");
                            String medida = scanner.nextLine().toUpperCase();
                            Medida m = Medida.valueOf(medida);

                            Produto produto = new Produto(tipo, descricao, peso, quantidade, m);

                            Conexao.inserirProduto(conexao, tipo, descricao, peso, quantidade, m);
                            System.out.println("_________________________________");
                            System.out.println("* Produto inserido com sucesso! *");
                            System.out.println("_________________________________");
                            break;
                        case 2:
                            System.out.println("");
                            System.out.println("");
                            Conexao.listarProdutos(conexao);
                            System.out.println("");
                            System.out.println("");
                            System.out.print("Digite o ID do produto que queira deletar: ");
                            int id = scanner.nextInt();
                            Conexao.deletarProduto(conexao, id);
                            break;
                        case 3:
                            System.out.println("");
                            System.out.println("");
                            Conexao.listarProdutos(conexao);
                            System.out.println("");
                            System.out.println("");
                            System.out.print("Digite o ID do produto que queria editar: ");
                            int idParaEditar = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Tipo do produto (informatica, limpeza, casa, decoracao, etc): ");
                            String tipoEditar = scanner.nextLine();
                            System.out.print("Descrição do produto: ");
                            String descricaoEditar = scanner.nextLine();
                            System.out.print("Peso do produto: ");
                            float pesoEditar = scanner.nextFloat();
                            System.out.print("Quantidade do produto: ");
                            int quantidadeEditar = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Medida do produto (METRO, METRO_QUADRADO, LITRO OU KG): ");
                            String medidaEditar = scanner.nextLine().toUpperCase();
                            Medida mEditar = Medida.valueOf(medidaEditar);
                            Conexao.editarProduto(conexao, idParaEditar, tipoEditar, descricaoEditar, pesoEditar, quantidadeEditar, mEditar);
                            break;
                        case 4:
                            System.out.println("");
                            System.out.println("");
                            Conexao.listarProdutos(conexao);
                            System.out.println("");
                            System.out.println("");
                            break;
                        case 5:
                            programa = false;
                            conexao.close();
                            System.out.println("Saindo do gerenciador...");
                            break;
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (conexao != null && !conexao.isClosed()) {
                        conexao.close();
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("Falha na conexão com o banco de dados.");
        }
    }
}