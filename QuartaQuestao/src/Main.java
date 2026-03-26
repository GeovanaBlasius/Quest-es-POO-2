public class Main {
    public static void main(String[] args) {

        DicionarioGenerico<Double> mapaPrecos = new DicionarioGenerico<>();

        System.out.println("--- Testando Inserções ---");
        System.out.println("Inserindo 'Arroz': " + mapaPrecos.add("Arroz", 25.50)); // true
        System.out.println("Inserindo 'Feijão': " + mapaPrecos.add("Feijão", 9.80));  // true
        System.out.println("Inserindo 'Arroz' novamente: " + mapaPrecos.add("Arroz", 30.00)); // false

        System.out.println("\n--- Testando Buscas ---");
        System.out.println("Busca 'Arroz': " + mapaPrecos.buscar("Arroz"));
        System.out.println("Busca 'Batata': " + mapaPrecos.buscar("Batata"));

        DicionarioGenerico<String> mapaTraducao = new DicionarioGenerico<>();
        mapaTraducao.add("Hello", "Olá");
        System.out.println("\nDicionário de Tradução: " + mapaTraducao.buscar("Hello"));
    }
}