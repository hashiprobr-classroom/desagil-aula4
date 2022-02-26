package br.edu.insper.desagil.aula4.atividade;

public class Matricula {
	private Aluno aluno;
	private boolean trancada;

	public Matricula(Aluno aluno) {
		this.aluno = aluno;
		this.trancada = false;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public boolean isTrancada() {
		return trancada;
	}

	public void setTrancada(boolean trancada) {
		this.trancada = trancada;
	}
}
