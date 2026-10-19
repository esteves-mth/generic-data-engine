package br.com.esteves.engine;

import br.com.esteves.engine.model.Produto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    @Test
    public void deveCriarProdutoValido(){
        Long id = 1L;
        String nome = "Mouse";
        String categoria = "Periferico";
        double preco = 100.00;

        Produto produto = new Produto(id, nome, categoria, preco);

        assertEquals(id, produto.getID());
        assertEquals(nome, produto.getNome());
        assertEquals(categoria, produto.getCategoria());
        assertEquals(preco, produto.getPreco());
    }

    @Test
    public void deveLancarErroseIdForNulo(){
        assertThrows(IllegalArgumentException.class, () -> {
           new Produto(null, "Teclado", "Periferico", 200.00);
        });
    }

    @Test
    public void deveLancarErroseNomeForVazio(){
        assertThrows(IllegalArgumentException.class, () -> {
            new Produto(1L, " ", "Periferico", 200.00);
        });
    }

    @Test
    public void deveLancarErrosePrecoForNegativo(){
        assertThrows(IllegalArgumentException.class, () -> {
                new Produto(1L, "Teclado", "Periferico", -200.00);
        });
    }
}
