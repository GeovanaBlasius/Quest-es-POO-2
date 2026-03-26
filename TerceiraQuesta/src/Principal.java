class Eletronico extends ProdutoX {
    public Eletronico(String nome, double preco) {
        super(nome, preco);
    }
}

public class Principal {
    public static void main(String[] args) {
        Pedido<ProdutoX> meuPedido = new Pedido<>();

        ProdutoX p1 = new ProdutoX("Cadeira Escritório", 600.0);
        Eletronico e1 = new Eletronico("Mouse Gamer", 120.0);

        meuPedido.adicionarProduto(p1);
        meuPedido.adicionarProduto(e1);

        meuPedido.mostrarLista();
    }
}