package br.exemplos.principio_substituicao_liskov.refatorado;

public class EstudanteRefatorado {
    String nome;

    public EstudanteRefatorado(String nome) {
        this.nome = nome;
    }

    public void estudar() {
        System.out.println(nome + " está estudando.");
    }
}
