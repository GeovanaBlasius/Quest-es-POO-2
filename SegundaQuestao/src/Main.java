import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date hoje = new Date();

        Produto<Integer> produtoAntigo = new Produto<>(101, 1500.0, hoje, hoje);
        Produto<String> produtoNovo = new Produto<>("BR-90-X", 2500.0, hoje, hoje);

        System.out.println("- Sistema de Negociação -");
        System.out.println(produtoAntigo);
        System.out.println(produtoNovo);

        Integer idInt = produtoAntigo.getId();
        String idStr = produtoNovo.getId();

        System.out.println("\nID do Cliente A: " + idInt);
        System.out.println("ID do Cliente B: " + idStr);
    }
}