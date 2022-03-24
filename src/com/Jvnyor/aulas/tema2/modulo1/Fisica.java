package com.Jvnyor.aulas.tema2.modulo1;

public class Fisica extends Pessoa {

	public Fisica(String identificador, String nome, String nacionalidade, String naturalidade) {
		super(identificador, nome, nacionalidade, naturalidade);
		// TODO Auto-generated constructor stub
	}

	protected String identificador, nome, nacionalidade, naturalidade;
	
	public boolean validaCPF ( String CPF ) {
		boolean check = false;
		if (CPF.length() == 11) {
			check = true;
		}
		return check;
	}
	
	protected void atualizarID ( String CPF ) {
		if ( validaCPF ( CPF ) )
			this.identificador = CPF;
		else
			System.out.println ( "ERRO: CPF invalido!" );
	}
	
}
