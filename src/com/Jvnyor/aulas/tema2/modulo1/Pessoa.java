//Pacotes
package com.Jvnyor.aulas.tema2.modulo1;

//Classe
public class Pessoa {
	//Atributos
	protected String identificador , nome , nacionalidade , naturalidade;

	//Métodos
	public Pessoa ( String identificador , String nome , String nacionalidade , String naturalidade ) {
		this.identificador = identificador;
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.naturalidade = naturalidade;
	}
	protected void atualizarNome ( String nome ) {
		this.nome = nome;
	}
	protected String recuperarNome ( ) {
		return this.nome;
	}
	protected String recuperarNacionalidade ( ) {
		return this.nacionalidade;
	}
	protected String recuperarNaturalidade ( ) {
		return this.naturalidade;
	}
	protected void atualizarID ( String identificador ) {
		this.identificador = identificador;
	}
	protected String recuperarID ( ) {
		return this.identificador;
	}
}