import java.util.ArrayList;
import java.util.List;

public class Loja {

    private List<Item> itens = new ArrayList<>();

    public void adicionarItem(String nomeItem, String nomeCategoria, String descricaoCategoria) {
        Categoria categoria = CategoriaFactory.getCategoria(nomeCategoria, descricaoCategoria);
        Item item = new Item(nomeItem, categoria);
        itens.add(item);
    }

    public List<String> obterItens() {
        List<String> saida = new ArrayList<String>();
        for (Item item : this.itens) {
            saida.add(item.obterItem());
        }
        return saida;
    }

}