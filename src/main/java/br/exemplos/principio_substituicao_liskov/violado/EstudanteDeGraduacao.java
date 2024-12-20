package br.exemplos.principio_substituicao_liskov.violado;

public class EstudanteDeGraduacao extends Estudante{
    public EstudanteDeGraduacao(String nome) {
        super(nome);
    }

    @Override
    public void estudar() {
        System.out.println(nome + " está estudando e pesquisando.");
    }

    @Override
    public void entregarTCC() {
        System.out.println(nome + "Estuandte de pós não entrega tcc .");
    }
}
