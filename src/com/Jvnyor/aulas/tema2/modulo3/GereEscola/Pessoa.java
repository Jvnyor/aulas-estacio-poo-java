package com.Jvnyor.aulas.tema2.modulo3.GereEscola;

//Classe
public abstract class Pessoa {
	
	private String identificador;
	
	public Pessoa(String identificador) {
		super();
		this.identificador = identificador;
	}

	protected abstract boolean atualizarID ( String identificador );
	
	protected String recuperarID ( ) {
		return this.identificador;
	}
	
}
