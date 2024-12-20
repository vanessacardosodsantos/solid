package br.exemplos.principio_aberto_fechado.refatorado;

public class Formal implements Personalidade {
    @Override
    public String saudar() {
              return "Boa tarde, senhor.";
    }
}
