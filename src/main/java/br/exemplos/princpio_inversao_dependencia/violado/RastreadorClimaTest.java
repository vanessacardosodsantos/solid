package br.exemplos.princpio_inversao_dependencia.violado;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class RastreadorClimaTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void testClima() {
        RastreadorClima rastreador = new RastreadorClima();
        rastreador.setCondicoesAtuais("chovendo");

        assertEquals("chovendo", rastreador.condicoesAtuais);
    }

    @Test
    public void testAlertaCelularChuva() {
        RastreadorClima rastreador = new RastreadorClima();
        System.setOut(new PrintStream(outContent));
        rastreador.setCondicoesAtuais("chovendo");

        assertEquals("Está chovendo", outContent.toString());
    }

    @Test
    public void testAlertsEmailSol() {
        RastreadorClima rastreador = new RastreadorClima();
        System.setOut(new PrintStream(outContent));
        rastreador.setCondicoesAtuais("sol");

        assertEquals("Está sol", outContent.toString());
    }

    @Test
    public void testAlertaCelular() {
        Celular celular = new Celular();
        assertEquals("Está chovendo", celular.gerarAlertaMeteorologico("chuva"));
    }

    @Test
    public void testAlertaEmail() {
        Email email = new Email();
        assertEquals("Está sol", email.gerarAlertaMeteorologico("sol"));
    }
}
