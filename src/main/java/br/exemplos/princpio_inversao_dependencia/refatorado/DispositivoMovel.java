package br.exemplos.princpio_inversao_dependencia.refatorado;

public class DispositivoMovel implements Notificar {

    @Override
    public void alertaCondicoesMeteorologicas(String condicoesTempo) {
        if (condicoesTempo == "chuva") {
            System.out.print("Está chovendo");
        }
    }
}
