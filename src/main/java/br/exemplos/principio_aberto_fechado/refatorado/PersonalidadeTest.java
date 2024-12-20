package br.exemplos.principio_aberto_fechado.refatorado;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonalidadeTest {
    @Test
    public void testFormal() {
        Formal fp = new Formal();
        assertEquals("Boa tarde, senhor.", fp.saudar());
    }
}
