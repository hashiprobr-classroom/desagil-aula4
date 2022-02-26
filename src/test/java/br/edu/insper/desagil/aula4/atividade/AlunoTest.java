package br.edu.insper.desagil.aula4.atividade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlunoTest {
	private Aluno a;

	@BeforeEach
	private void setUp() {
		a = new Aluno(1, "João da Silva", 5.0);
	}

	@Test
	void constroi() {
		assertEquals(1, a.getId());
		assertEquals("João da Silva", a.getNome());
		assertEquals(5.0, a.getCr(), 0.000001);
	}

	@Test
	void mudaCr() {
		a.setCr(7.5);
		assertEquals(7.5, a.getCr(), 0.000001);
	}
}
