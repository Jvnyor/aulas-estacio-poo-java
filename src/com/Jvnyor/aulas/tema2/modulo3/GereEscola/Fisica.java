package com.Jvnyor.aulas.tema2.modulo3.GereEscola;

import java.util.Calendar;

public class Fisica extends Pessoa {

	public Fisica(String nome, Calendar data_inicio_existencia, String identificador, Endereco endereco , String nacionalidade, String naturalidade) {
		super(identificador);
		// TODO Auto-generated constructor stub
	}

	protected String identificador, nome, nacionalidade, naturalidade;
	
	protected Calendar data_inicio_existencia;
	
	protected Endereco endereco;
	
	@Override
	protected boolean atualizarID(String CPF) {
		// TODO Auto-generated method stub
		boolean check = false;
		CPF = CPF.replace(".", "").replace("-", "");
		if ( validaCPF ( CPF ) ) {
			this.identificador = CPF;
			check = true;
		} else {
			System.out.println ( "ERRO: CPF invalido!" );
		}
		return check;
	}

	private boolean validaCPF(String CPF) {
		// TODO Auto-generated method stub
		boolean check = false;
		if (CPF.length() == 11) {
			check = true;
		}
		return check;
	}

}
