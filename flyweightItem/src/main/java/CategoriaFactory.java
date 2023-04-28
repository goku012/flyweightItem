import java.util.HashMap;
import java.util.Map;

public class CategoriaFactory {
    private static Map<String, Categoria> categorias = new HashMap<>();

    public static Categoria getCategoria(String nome, String descricao) {
        Categoria categoria = categorias.get(nome);
        if (categoria == null) {
            categoria = new Categoria(nome, descricao);
            categorias.put(nome, categoria);
        }
        return categoria;
    }

    public static int getTotalCategorias() {
        return categorias.size();
    }

}