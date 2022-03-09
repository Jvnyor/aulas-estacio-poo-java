package com.Jvnyor.aulas.tema2.modulo3;

//Classe
public abstract class Pessoa {
	
	private String identificador;
	
	protected abstract boolean atualizarID ( String identificador );
	
	protected String recuperarID ( ) {
		return this.identificador;
	}
	
}
