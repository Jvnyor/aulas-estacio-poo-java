package com.Jvnyor.aulas.tema2.modulo1;

//Importações
import java.util.UUID;

//Classe
public class Aluno extends Pessoa {

	private String identificador;
	
	//Atributos
	private String matricula;
	
	//Métodos
	public Aluno ( String identificador , String nome , String nacionalidade , String naturalidade ) {
		super ( identificador , nome , nacionalidade , naturalidade );
		matricula = UUID.randomUUID( ).toString( );
	}
	
	public void atualizarID ( ) {
		if ( this.identificador.isBlank() )
			this.identificador = UUID.randomUUID( ).toString( );
		else
			System.out.println ( "ERRO: Codigo matricula ja existente!" );
	}
}