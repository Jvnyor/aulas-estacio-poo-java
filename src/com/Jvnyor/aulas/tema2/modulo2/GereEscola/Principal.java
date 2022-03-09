package com.Jvnyor.aulas.tema2.modulo2.GereEscola;

import java.util.Calendar;

public class Principal {

	private static int I1 , I2 , I3;
	private static String S1 , S2 , S3;
	private static Fisica p1 , p2;
	private static Pessoa p3;
	private static Pessoa grupo [];
	private static Calendar data_nasc = Calendar.getInstance();
	public static void main (String args[]) {
		p1 = new Fisica ( "Marco Ant�nio" , data_nasc , "365.586.875-45", null , "Brasil" , "Rio de Janeiro" );
		p2 = new Fisica ( "Marco Ant�nio" , data_nasc , "365.586.875-45", null , "Brasil" , "Rio de Janeiro" );
		p3 = new Pessoa ( "Classe Pessoa" , null , null , null , "Brasil" , "Rio de Janeiro" );
		I1 = 1;
		I2 = 2;
		I3 = 1;
		S1 = "a";
		S2 = "b";
		S3 = "a";
		grupo = new Pessoa [2];
		grupo [0] = new Fisica ( "Marco Ant�nio" , data_nasc , "365.586.875-45", null , "Brasil" , "Rio de Janeiro" );
		grupo [1] = new Pessoa ("Escola Novo Mundo Ltda" , data_nasc , "43.186.666/0026-32" , null , "Brasil" , "Rio de Janeiro");
		for ( int i = 0 ; i <= 1 ; i++ )
			System.out.println( "grupo[" + i + "]: " + grupo[i].toString() );
		
		compararEquals(p1,p2,p3);
		compararEquals(I1, I2, I3);
		compararEquals(S1, S2, S3);
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
		if ( p1 instanceof Pessoa )
			System.out.println("p1 � inst�ncia do tipo Pessoa.");
		else
			System.out.println("p1 n�o � inst�ncia do tipo Pessoa.");
		if ( p2 instanceof Pessoa )
		System.out.println("p2 � inst�ncia do tipo Pessoa.");
		else
			System.out.println("p2 n�o � inst�ncia do tipo Pessoa.");
		if ( p3 instanceof Pessoa )
			System.out.println("p3 � inst�ncia do tipo Pessoa.");
		else
			System.out.println("p3 n�o � inst�ncia do tipo Pessoa.");
		if ( p3 instanceof Fisica )
			System.out.println("p3 � inst�ncia do tipo F�sica.");
		else
			System.out.println("p3 n�o � inst�ncia do tipo F�sica.");
	}
	
	private static void compararEquals ( Object o1 , Object o2 , Object o3 ){
		System.out.println("Uso de EQUALS para comparar " + o1.getClass().getName());
			if ( o1.equals( o2 ) )
				System.out.println("o1 == o2");
			else
				System.out.println("o1 != o2");
			if ( o1.equals(o3) )
				System.out.println("o1 == o3");
			else
				System.out.println("o1 != o3");
	}
}
