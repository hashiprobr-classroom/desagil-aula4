package br.edu.insper.desagil.aula4.atividade;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MatriculaTest {
	private Matricula m;

	@BeforeEach
	private void setUp() {
		Aluno aluno = new Aluno(1, "João da Silva", 5.0);
		m = new Matricula(aluno);
	}

	@Test
	void constroi() {
		assertNotNull(m.getAluno());
		assertFalse(m.isTrancada());
	}

	@Test
	void mudaTrancada() {
		m.setTrancada(true);
		assertTrue(m.isTrancada());
	}
}
