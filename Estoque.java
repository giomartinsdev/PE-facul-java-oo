import java.util.ArrayList;

public class Estoque {
    private ArrayList<Produto> produtos;
    private double faturamentoDiario;

    public Estoque() {
        produtos = new ArrayList<>();
        faturamentoDiario = 0.0;
    }

    public void adicionarProduto(Produto produto) {
        for (Produto p : produtos) {
            if (p.getNome().equalsIgnoreCase(produto.getNome())) {
                p.setQuantidade(p.getQuantidade() + produto.getQuantidade());
                return;
            }
        }
        produtos.add(produto);
    }

    public void removerProduto(String nome, int quantidade) {
        for (Produto p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                if (p.getQuantidade() >= quantidade) {
                    p.setQuantidade(p.getQuantidade() - quantidade);
                    faturamentoDiario += quantidade * p.getPrecoUnitario();
                    System.out.println("Produto removido com sucesso!");
                } else {
                    System.out.println("Erro: Quantidade insuficiente no estoque.");
                }
                return;
            }
        }
        System.out.println("Erro: Produto não encontrado no estoque.");
    }

    public void exibirEstoque() {
        System.out.println("----- Estoque Atual -----");
        for (Produto p : produtos) {
            System.out.println(p);
        }
        System.out.println("-------------------------");
    }

    public double calcularFaturamento() {
        return faturamentoDiario;
    }
}
