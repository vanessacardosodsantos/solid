package br.exemplos.principio_substituicao_liskov.violado;

public class Estudante {
    String nome;

    public Estudante(String nome) {
        this.nome = nome;
    }

    public void estudar() {
        System.out.println(nome + " está estudando.");
    }


    public void entregarTCC(){
        System.out.println(nome + " entregar tcc");
    }
}
