package br.exemplos.principio_segregacao_interface.refatorado;

public class AguiaRefatorado implements AnimalVoador, AnimalTrocaPenas {
    String localizacao;
    int numberoPenas;

    public AguiaRefatorado(int inicialNumeroPenas) {
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
