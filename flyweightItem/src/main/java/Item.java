public class Item {

    private String nome;
    private Categoria categoria;

    public Item(String nome, Categoria categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String obterItem() {
        return "Item{" +
                "nome='" + this.nome + '\'' +
                ", categoria='" + categoria.getNome() + '\'' +
                ", descricao='" + categoria.getDescricao() + '\'' +
                '}';
    }
}