package com.Jvnyor.aulas.tema2.modulo1;

public class Juridica extends Pessoa {

	public Juridica(String identificador, String nome, String nacionalidade, String naturalidade) {
		super(identificador, nome, nacionalidade, naturalidade);
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
	
	protected void atualizarID ( String CNPJ ) {
		if ( validaCNPJ ( CNPJ ) )
			this.identificador = CNPJ;
		else
			System.out.println ( "ERRO: CNPJ invalido!" );
	}
	
}
