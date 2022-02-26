package br.edu.insper.desagil.aula4.atividade;

public class Aluno {
	private int id;
	private String nome;
	private double cr;

	public Aluno(int id, String nome, double cr) {
		this.id = id;
		this.nome = nome;
		this.cr = cr;
	}

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public double getCr() {
		return cr;
	}

	public void setCr(double cr) {
		this.cr = cr;
	}
}
