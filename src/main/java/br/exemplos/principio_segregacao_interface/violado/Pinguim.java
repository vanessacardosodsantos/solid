package br.exemplos.principio_segregacao_interface.violado;

public class Pinguim implements Passaro{
    String localizacao;
    int numberoPenas;

    public Pinguim(int inicialNumeroPenas) {
        this.numberoPenas = inicialNumeroPenas;
    }

    @Override
    public void voa() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void trocaPenas() {
        this.numberoPenas -= 1;
    }

    public void nada() {
        this.localizacao = "na água";
    }
}
