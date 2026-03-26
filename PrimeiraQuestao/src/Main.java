public class Main {
    public static void main(String[] args) {

        Caixa<String> caixaTexto = new Caixa<>("Primeira questão");
        String texto = caixaTexto.getConteudo();
        System.out.println("Conteúdo Texto: " + texto);

        Caixa<Integer> caixaNumero = new Caixa<>(2026);
        Integer numero = caixaNumero.getConteudo();
        System.out.println("Conteúdo Número: " + numero);

        Produto meuProduto = new Produto("Notebook");
        Caixa<Produto> caixaProduto = new Caixa<>(meuProduto);
        System.out.println("Conteúdo Objeto: " + caixaProduto.getConteudo() );
    }
}