import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class LojaTest {

    @Test
    void deveRetornarItens() {
        Loja loja = new Loja();
        loja.adicionarItem("Camiseta", "Roupas", "Camisetas");
        loja.adicionarItem("Tênis", "Calçados", "Tênis");
        loja.adicionarItem("Meia", "Acessórios", "Meias");

        List<String> saida = Arrays.asList(
                "Item{nome='Camiseta', categoria='Roupas', descricao='Camisetas'}",
                "Item{nome='Tênis', categoria='Calçados', descricao='Tênis'}",
                "Item{nome='Meia', categoria='Acessórios', descricao='Meias'}");

        assertEquals(saida, loja.obterItens());
    }

    @Test
    void deveRetornarTotalCategorias() {
        Loja loja = new Loja();
        loja.adicionarItem("Camiseta", "Roupas", "Camisetas");
        loja.adicionarItem("Calça", "Roupas", "Calças");
        loja.adicionarItem("Tênis", "Calçados", "Tênis");
        loja.adicionarItem("Meia", "Acessórios", "Meias");

        assertEquals(3, CategoriaFactory.getTotalCategorias());
    }

}