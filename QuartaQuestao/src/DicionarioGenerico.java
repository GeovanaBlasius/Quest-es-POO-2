import java.util.ArrayList;
import java.util.List;

public class DicionarioGenerico<T> {
    private List<Par<T>> dados = new ArrayList<>();

    public boolean add(String chave, T valor) {
        // Verifica se a chave já existe
        for (Par<T> p : dados) {
            if (p.getChave().equalsIgnoreCase(chave)) {
                return false;
            }
        }
        dados.add(new Par<>(chave, valor));
        return true;
    }

    public String buscar(String chave) {
        for (Par<T> p : dados) {
            if (p.getChave().equalsIgnoreCase(chave)) {
                return p.toString();
            }
        }
        return "Chave não encontrada.";
    }
}