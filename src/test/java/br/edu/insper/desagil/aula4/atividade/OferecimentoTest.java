package br.edu.insper.desagil.aula4.atividade;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OferecimentoTest {
	private Oferecimento o;

	@BeforeEach
	void setUp() {
		Disciplina disciplina = new Disciplina("DESAGIL", "Desenvolvimento Colaborativo Ágil");
		LocalDate inicio = LocalDate.of(2022, Month.FEBRUARY, 14);
		LocalDate fim = LocalDate.of(2022, Month.JUNE, 30);
		o = new Oferecimento(disciplina, inicio, fim);
	}

	@Test
	void constroi() {
		assertNotNull(o.getDisciplina());
		assertNotNull(o.getInicio());
		assertNotNull(o.getFim());
		assertEquals(0, o.numeroDeAlunos());
	}

	@Test
	void fazUmaMatricula() {
		Aluno a = new Aluno(1, "João da Silva", 5.0);
		o.fazMatricula(a);
		assertEquals(1, o.numeroDeAlunos());
	}

	@Test
	void fazDuasMatriculas() {
		Aluno a = new Aluno(1, "João da Silva", 5.0);
		o.fazMatricula(a);
		Aluno b = new Aluno(2, "Maria de Souza", 7.5);
		o.fazMatricula(b);
		assertEquals(2, o.numeroDeAlunos());
	}
}
