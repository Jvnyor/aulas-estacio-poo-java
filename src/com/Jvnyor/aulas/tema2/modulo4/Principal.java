package com.Jvnyor.aulas.tema2.modulo4;

public class Principal {
	//Atributos
	private static Identificador refIdt;
	private static iPessoa refiPessoa;
	//M�todos
	public static void main (String args[]) {
		refIdt = new Pessoa ( );
		refIdt.atualizarID("M-1020/001");
		System.out.println ( refIdt.recuperarID() );
		//refIdt.atualizarNome ("Jo�o Batista");
		refiPessoa = (Pessoa) refIdt;
		refiPessoa.atualizarNome("Jo�o Batista");
		System.out.println(refiPessoa.recuperarNome());
	}
}