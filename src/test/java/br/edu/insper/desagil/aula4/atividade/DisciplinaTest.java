package br.edu.insper.desagil.aula4.atividade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DisciplinaTest {
	@Test
	void constroi() {
		Disciplina d = new Disciplina("DESAGIL", "Desenvolvimento Colaborativo Ágil");
		assertEquals("DESAGIL", d.getCodigo());
		assertEquals("Desenvolvimento Colaborativo Ágil", d.getNome());
	}
}
