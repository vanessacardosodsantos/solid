package br.exemplos.principio_responsabilidade_unica.refatorado;

import java.util.ArrayList;

public class BoardDisplay {
    private final ArrayList<String> pontos;

    public BoardDisplay(ArrayList<String> pontos) {
        this.pontos = pontos;
    }

    public void display() {
        String formattedRodada = pontos.get(0) + " | " + pontos.get(1) + " | " + pontos.get(2) + "\n"
                + pontos.get(3) + " | " + pontos.get(4) + " | " + pontos.get(5) + "\n"
                + pontos.get(6) + " | " + pontos.get(7) + " | " + pontos.get(8);
        System.out.print(formattedRodada);
    }
}
