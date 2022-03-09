package com.Jvnyor.aulas.tema2.modulo2.GereEscola;

import java.util.Calendar;

public class Pessoa {
	//Atributos
	protected String nome , naturalidade , nacionalidade , identificador;
	private Calendar data_inicio_existencia;
	private int idade;
	private Endereco endereco;

	//Métodos
	public Pessoa ( String nome , Calendar data_inicio_existencia, String identificador , Endereco endereco , String nacionalidade , String naturalidade ) {
		this.nome = nome;
		this.data_inicio_existencia = data_inicio_existencia;
		this.identificador = identificador;
		this.endereco = endereco;
		this.nacionalidade = nacionalidade;
		this.naturalidade = naturalidade;
	}
	
	public boolean equals (Object obj) {
		if ( ( nome.equals( ( ( Pessoa ) obj ).nome ) ) && ( this instanceof Pessoa ) )
			return true;
		else
			return false;
	}
	
	public int hashCode () {
		if ( this instanceof Pessoa )
			return this.nome.hashCode();
		else
			return super.hashCode();
	}

	public String toString (){
		return "Objeto:" + "\n\t- Classe: " + getClass().getName() + "\n\t- Hash: " + Integer.toHexString(hashCode()) + "\n\t- Nome: " + nome + "\n\t- Identificador: " + identificador;
	}
}