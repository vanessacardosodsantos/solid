package br.exemplos.principio_substituicao_liskov.refatorado;

public class EstudanteDeGraduacaoRefatorado extends EstudanteRefatorado {
    public EstudanteDeGraduacaoRefatorado(String nome) {
        super(nome);
    }


    @Override
    public void estudar() {
        System.out.println(nome + " está estudando e pesquisando.");
    }

    public void entregarTCC() {
        System.out.println(nome + "Estuandte de pós não entrega tcc .");
    }
}
