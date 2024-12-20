package br.exemplos.principio_segregacao_interface.violado;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AguiaTest {
    @Test
    public void testAvesNoAr() {
        Aguia aguia = new Aguia(5);
        aguia.voa();
        assertEquals("acima das nuvens", aguia.localizacao);
    }

    @Test
    public void testPerdaDePenas() {
        Aguia aguia = new Aguia(5);
        aguia.trocaPenas();
        assertEquals(4, aguia.numberoPenas);
    }
}
