package br.exemplos.princpio_inversao_dependencia.violado;

public class Email {

    public String gerarAlertaMeteorologico(String condicoesTempo){
        String alert = "Está " + condicoesTempo;
        return alert;
    }
}
