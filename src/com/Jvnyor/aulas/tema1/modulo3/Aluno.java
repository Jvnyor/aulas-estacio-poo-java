package com.Jvnyor.aulas.tema1.modulo3;

public class Aluno {
	
	//Atributos    
	private String matricula , nome , naturalidade;
		
	//Métodos
	public Aluno ( String nome , String naturalidade ) {
			this.nome = nome;
			this.naturalidade = naturalidade;
	}
	
	@Override
	public String toString () {
		return String.format("%s(%s)", nome , naturalidade );
	}

	public String recuperarNaturalidade() {
		// TODO Auto-generated method stub
		return naturalidade;
	}
}