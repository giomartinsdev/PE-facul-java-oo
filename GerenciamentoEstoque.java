import java.util.Scanner;

public class GerenciamentoEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();
        
        boolean sair = false;
        while (!sair) {
            System.out.println("----- Sistema de Gerenciamento de Estoque -----");
            System.out.println("1. Adicionar Produto ao Estoque");
            System.out.println("2. Remover Produto do Estoque");
            System.out.println("3. Exibir Estoque");
            System.out.println("4. Exibir Faturamento Diário");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do Produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    System.out.print("Preço Unitário: ");
                    double preco = scanner.nextDouble();
                    Produto produto = new Produto(nomeProduto, quantidade, preco);
                    estoque.adicionarProduto(produto);
                    System.out.println("Produto adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Nome do Produto: ");
                    String nomeRemover = scanner.nextLine();
                    System.out.print("Quantidade a remover: ");
                    int qtdRemover = scanner.nextInt();
                    estoque.removerProduto(nomeRemover, qtdRemover);
                    break;
                case 3:
                    estoque.exibirEstoque();
                    break;
                case 4:
                    System.out.println("Faturamento Diário: R$ " + estoque.calcularFaturamento());
                    break;
                case 5:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
        scanner.close();
    }
}
