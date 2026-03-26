public class ProdutoX {
    private String nome;
    private double preco;

    public ProdutoX(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return nome + " (R$ " + preco + ")";
    }
}