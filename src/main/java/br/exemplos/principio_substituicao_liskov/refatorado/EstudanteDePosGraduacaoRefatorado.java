package br.exemplos.principio_substituicao_liskov.refatorado;

public class EstudanteDePosGraduacaoRefatorado extends EstudanteRefatorado {
    public EstudanteDePosGraduacaoRefatorado(String nome) {
        super(nome);
    }

    @Override
    public void estudar() {
        System.out.println(nome + " está estudando e pesquisando.");
    }

}
