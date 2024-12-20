package br.exemplos.principio_responsabilidade_unica.refatorado;

import java.util.ArrayList;
import java.util.List;

public class BoardRows {
    private final ArrayList<String> pontos;

    public BoardRows(ArrayList<String> pontos) {
        this.pontos = pontos;
    }

    public List<String> getPrimeiraRodada() {
        return pontos.subList(0, 3);
    }

    public List<String> getSegundaRodada() {
        return pontos.subList(3, 6);
    }

    public List<String> getTerceiraRodada() {
        return pontos.subList(6, 9);
    }
}
