package com.Jvnyor.aulas.tema1.modulo2;

import java.util.Calendar;

public class Principal {
	//Atributos
	
	//Aluno
	private static Aluno aluno;
	private static Endereco endereco;
	
	//Diretor
	private static Empregado empregado , diretor;
	
	//Método main
	public static void main (String args[]) {
		
		//Aluno
		int idade;
		Calendar data = Calendar.getInstance();
		data.set(1980, 10, 23);
		endereco = new Endereco ();
		endereco.definirPais("Brasil");
		endereco.definirUF("RJ");
		endereco.definirCidade ("Rio de Janeiro");
		endereco.definirRua("Avenida Rio Branco");
		endereco.definirNumero("156A");
		endereco.definirCEP(20040901);
		endereco.definirComplemento("Bloco 03 - Ap 20.005");
		aluno = new Aluno ("Marco Antônio", data , 901564098 , endereco);
		aluno.atualizarIdade();
		idade = aluno.recuperarIdade();

		//Diretor
		data = Calendar.getInstance();
		data.set(1980, 10, 23);
		empregado = new Empregado ("Clara Silva", data , 211456937 , null);
		empregado.gerarMatricula();
		diretor = new Diretor ("Marco Antônio", data , 901564098 , null);
		diretor.gerarMatricula();
		System.out.println ("A matrícula do Diretor é: " + diretor.recuperarMatricula());
		System.out.println ("A matrícula do Empregado é: " + empregado.recuperarMatricula());
		
	}
}
