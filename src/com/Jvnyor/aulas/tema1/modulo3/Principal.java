package com.Jvnyor.aulas.tema1.modulo3;

public class Principal {
	//Atributos
	private static Aluno aluno1 , aluno2 , aluno3 , aluno4 , aluno5 , aluno6 , aluno7 , aluno8 , aluno9;
	private static Escola escola;
	
	//M�todo main
	public static void main (String args[]) {
		escola = new Escola ( "Escola Pedro �lvares Cabral" , "42.336.174/0006-13");
		criarAlunos ();
	matricularAlunos ();
	escola.agruparAlunos();
}
	
	//M�todos
	private static void criarAlunos ( ) {
		aluno1 = new Aluno ( "Marco Ant�nio" , "Rio de Janeiro" );
		aluno2 = new Aluno ( "Clara Silva" , "Rio de Janeiro" );
		aluno3 = new Aluno ( "Marcos Cintra" , "Sorocaba" );
		aluno4 = new Aluno ( "Ana Beatriz" , "Barra do Pirai" );
		aluno5 = new Aluno ( "Marcio Gomes" , "S�o Paulo" );
		aluno6 = new Aluno ( "Jo�o Carlos" , "Sorocaba" );
		aluno7 = new Aluno ( "C�sar Augusto" ,  "S�o Paulo" );
		aluno8 = new Aluno ( "Alejandra Gomez" , "Madri" );
		aluno9 = new Aluno ( "Castelo Branco" , "S�o Paulo" );
	}
	private static void matricularAlunos ( ) {
		escola.matricularAluno(aluno1);
		escola.matricularAluno(aluno2);
		escola.matricularAluno(aluno3);
		escola.matricularAluno(aluno4);
		escola.matricularAluno(aluno5);
		escola.matricularAluno(aluno6);
		escola.matricularAluno(aluno7);
		escola.matricularAluno(aluno8);
		escola.matricularAluno(aluno9);
	}
}