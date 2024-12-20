package br.exemplos.princpio_inversao_dependencia.refatorado;

public class EmailClient implements Notificar {

    @Override
    public void alertaCondicoesMeteorologicas(String condicoesTempo) {
        if (condicoesTempo == "sol") ;
        System.out.print("Está sol");
    }
}
