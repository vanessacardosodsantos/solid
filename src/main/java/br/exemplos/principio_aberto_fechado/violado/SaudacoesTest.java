package br.exemplos.principio_aberto_fechado.violado;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaudacoesTest {

    Saudacoes saudacoes = new Saudacoes();

    @Test
    public void testOi() {
        assertEquals("Oi.", saudacoes.saudar());
    }

    @Test
    public void testFormal() {
        saudacoes.setTipo("formal");
        assertEquals("Boa tarde, senhor.", saudacoes.saudar());
    }

    @Test
    public void testCasual() {
        saudacoes.setTipo("casual");
        assertEquals("Eai cara?", saudacoes.saudar());
    }

    @Test
    public void testIntimo() {
        saudacoes.setTipo("íntimo");
        assertEquals("Oi querida!", saudacoes.saudar());
    }
}
