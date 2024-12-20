package br.exemplos.principio_segregacao_interface.refatorado;

public class PinguimRefatorado implements AnimalNadador, AnimalTrocaPenas {
    String localizacao;
    int numberoPenas;

    public PinguimRefatorado(int inicialNumeroPenas) {
        this.numberoPenas = inicialNumeroPenas;
    }

    @Override
    public void trocaPenas() {
        this.numberoPenas -= 1;
    }

    public void nada() {
        this.localizacao = "na água";
    }
}
