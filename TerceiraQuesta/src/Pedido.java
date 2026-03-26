import java.util.ArrayList;
import java.util.List;

public class Pedido<T extends ProdutoX> {
    private List<T> listaProdutos;

    public Pedido() {
        this.listaProdutos = new ArrayList<>();
    }

    public void adicionarProduto(T produto) {
        listaProdutos.add(produto);
    }

    public void mostrarLista() {
        System.out.println("--- Itens do Pedido ---");
        for (T p : listaProdutos) {
            System.out.println("- " + p.toString());
        }
    }
}