package br.exemplos.princpio_inversao_dependencia.violado;

public class RastreadorClima {
    String condicoesAtuais;
    Celular celular;
    Email email;

    public RastreadorClima() {
        celular = new Celular();
        email = new Email();
    }

    public void setCondicoesAtuais(String descricaoTempo) {
        this.condicoesAtuais = descricaoTempo;
        if (descricaoTempo == "chovendo") {
            String alerta = celular.gerarAlertaMeteorologico(descricaoTempo);
            System.out.print(alerta);
        }
        if (descricaoTempo == "sol") {
            String alerta = email.gerarAlertaMeteorologico(descricaoTempo);
            System.out.print(alerta);
        }
    }
}
