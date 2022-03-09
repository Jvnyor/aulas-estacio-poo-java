package com.Jvnyor.aulas.tema2.modulo2.GereEscola;

import java.util.Calendar;

public class Fisica extends Pessoa {
	//Atributos

	//Métodos
	public Fisica ( String nome , Calendar data_nascimento , String CPF , Endereco endereco , String nacionalidade , String naturalidade ) {
		super ( nome , data_nascimento, CPF , endereco , nacionalidade , naturalidade );
		atualizarIdade ();
	}

	private void atualizarIdade() {
		// TODO Auto-generated method stub
		
	}
}