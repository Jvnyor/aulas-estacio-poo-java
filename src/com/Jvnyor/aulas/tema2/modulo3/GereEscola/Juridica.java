package com.Jvnyor.aulas.tema2.modulo3.GereEscola;

import com.Jvnyor.aulas.tema2.modulo3.Pessoa;

public class Juridica extends Pessoa {

	public Juridica(String identificador, String nome, String nacionalidade, String naturalidade) {
		super(identificador);
		// TODO Auto-generated constructor stub
	}

	protected String identificador;
	
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
		if ( validaCNPJ ( CNPJ ) ) {
			this.identificador = CNPJ;
			check = true;
		} else {
			System.out.println ( "ERRO: CNPJ invalido!" );
		}
		return check;
	}

}
