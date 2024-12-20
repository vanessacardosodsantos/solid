package br.exemplos.principio_segregacao_interface.violado;

public class Aguia implements Passaro{
    String localizacao;
    int numberoPenas;

    public Aguia(int inicialNumeroPenas) {
        this.numberoPenas = inicialNumeroPenas;
    }

    @Override
    public void voa() {
        this.localizacao = "acima das nuvens";
    }

    @Override
    public void trocaPenas() {
        this.numberoPenas -= 1;
    }
}
