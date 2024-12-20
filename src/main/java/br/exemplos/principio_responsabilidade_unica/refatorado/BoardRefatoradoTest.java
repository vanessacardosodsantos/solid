package br.exemplos.principio_responsabilidade_unica.refatorado;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BoardRefatoradoTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void testBoardNovePontos() {
        Board board = new Board();
        ArrayList<String> pontos = board.getPontos();

        assertEquals(9, pontos.size());

        for (int i = 0; i < 9; i++) {
            assertEquals(String.valueOf(i), pontos.get(i));
        }
    }

    @Test
    public void testPrimeiraRodada() {
        ArrayList<String> pontos = inicializarPontos();
        BoardRows boardRows = new BoardRows(pontos);

        List<String> primeiraRodada = boardRows.getPrimeiraRodada();
        assertEquals(List.of("0", "1", "2"), primeiraRodada);
    }

    @Test
    public void testSegundaRodada() {
        ArrayList<String> pontos = inicializarPontos();
        BoardRows boardRows = new BoardRows(pontos);

        List<String> segundaRodada = boardRows.getSegundaRodada();
        assertEquals(List.of("3", "4", "5"), segundaRodada);
    }

    @Test
    public void testTerceiraRodada() {
        ArrayList<String> pontos = inicializarPontos();
        BoardRows boardRows = new BoardRows(pontos);

        List<String> terceiraRodada = boardRows.getTerceiraRodada();
        assertEquals(List.of("6", "7", "8"), terceiraRodada);
    }

    private ArrayList<String> inicializarPontos() {
        ArrayList<String> pontos = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            pontos.add(String.valueOf(i));
        }
        return pontos;
    }

}
