package br.exemplos.principio_aberto_fechado.violado;

public class Saudacoes {
    String tipo;

    public String saudar() {
        if (this.tipo == "formal") {
            return "Boa tarde, senhor.";
        } else if (this.tipo == "casual") {
            return "Eai cara?";
        } else if (this.tipo == "íntimo") {
            return "Oi querida!";
        } else {
            return "Oi.";
        }
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
