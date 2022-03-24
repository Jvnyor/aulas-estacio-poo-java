package com.Jvnyor.aulas.tema2.modulo3.GereEscola;

import java.util.Calendar;

public class Juridica extends Pessoa {

	public Juridica(String nome, Calendar data_inicio_existencia, String identificador, Endereco endereco , String nacionalidade, String naturalidade) {
		super(identificador);
		// TODO Auto-generated constructor stub
	}

	protected String identificador, nome, nacionalidade, naturalidade;
	
	protected Calendar data_inicio_existencia;
	
	protected Endereco endereco;
	
	public boolean validaCNPJ ( String CNPJ ) {
		boolean check = false;
		if (CNPJ.length() == 14) {
			check = true;
		}
		return check;
 	}
	
	@Override
	protected boolean atualizarID ( String CNPJ ) {
		boolean check = false;
		CNPJ = CNPJ.replace(".", "").replace("-", "").replace("/", "");
		if ( validaCNPJ ( CNPJ ) ) {
			this.identificador = CNPJ;
			check = true;
		} else {
			System.out.println ( "ERRO: CNPJ invalido!" );
		}
		return check;
	}

}
