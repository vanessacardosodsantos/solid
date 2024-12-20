package br.exemplos.principio_aberto_fechado.refatorado;

public class Saudacao {

    private Personalidade personalidade;

    public Saudacao(Personalidade personalidade) {
        this.personalidade = personalidade;
    }

    public String saudacao() {
        return this.personalidade.saudar();
    }
}
