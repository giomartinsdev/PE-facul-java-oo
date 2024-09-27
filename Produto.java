public class Produto {
    private String nome;
    private int quantidade;
    private double precoUnitario;

    public Produto(String nome, int quantidade, double precoUnitario) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public double calcularValorEstoque() {
        return quantidade * precoUnitario;
    }

    @Override
    public String toString() {
        return nome + " | Quantidade: " + quantidade + " | Preço Unitário: R$ " + precoUnitario;
    }
}
