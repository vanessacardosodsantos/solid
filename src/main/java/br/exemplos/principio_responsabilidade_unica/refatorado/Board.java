package br.exemplos.principio_responsabilidade_unica.refatorado;

import java.util.ArrayList;

public class Board {
    ArrayList<String> pontos;

    public Board(){
        this.pontos = new ArrayList<>();
        for(int i = 0; i < 9; i++){
            this.pontos.add(String.valueOf(i));
        }
    }

    public ArrayList<String> getPontos() {
        return pontos;
    }
}
