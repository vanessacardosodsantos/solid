package br.exemplos.princpio_inversao_dependencia.refatorado;

public class RastreadorClimaRefatorado {
    String condicoesAtuais;

    public void setCondicoesAtuais(String descricaoTempo) {
        this.condicoesAtuais = descricaoTempo;
    }

    public void notify(Notificar notificar) {
        notificar.alertaCondicoesMeteorologicas(condicoesAtuais);
    }
}
