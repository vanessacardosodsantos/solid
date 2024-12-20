package br.exemplos.principio_responsabilidade_unica.violado;

import java.util.ArrayList;

public class Board {
    public ArrayList<String> pontos;

    public Board(){
        this.pontos = new ArrayList<>();
        for(int i = 0; i < 9; i++){
            this.pontos.add(String.valueOf(i));
        }
    }

    public ArrayList<String> primeiraRodada() {
        ArrayList<String> primeira = new ArrayList<>();
        primeira.add(this.pontos.get(0));
        primeira.add(this.pontos.get(1));
        primeira.add(this.pontos.get(2));
        return primeira;
    }

    public ArrayList<String> segundaRodada() {
        ArrayList<String> segunda = new ArrayList<>();
        segunda.add(this.pontos.get(3));
        segunda.add(this.pontos.get(4));
        segunda.add(this.pontos.get(5));
        return segunda;
    }

    public ArrayList<String> terceiraRodada() {
        ArrayList<String> terceira = new ArrayList<>();
        terceira.add(this.pontos.get(6));
        terceira.add(this.pontos.get(7));
        terceira.add(this.pontos.get(8));
        return terceira;
    }

    public void display() {
        String formattedRodada = this.pontos.get(0) + " | " + this.pontos.get(1) + " | " + this.pontos.get(2) + "\n" + this.pontos.get(3) + " | " + this.pontos.get(4) + " | " + this.pontos.get(5) + "\n" + this.pontos.get(6) + " | " + this.pontos.get(7) + " | " + this.pontos.get(8);
        System.out.print(formattedRodada);
    }
}
