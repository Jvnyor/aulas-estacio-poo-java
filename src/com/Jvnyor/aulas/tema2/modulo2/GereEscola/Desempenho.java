package com.Jvnyor.aulas.tema2.modulo2.GereEscola;

import com.Jvnyor.aulas.tema2.modulo2.Matematica.Nota;

//Classe
public class Desempenho extends Nota {
	//Atributos
	private float media , CR;
	private Nota nota;

	//Métodos
	public Desempenho () {
		nota = new Nota ();
		media = calcularMedia();
		CR = calcularCoeficienteRendimento();
		//media = nota.calculaMedia();
		//CR = nota.caulculaCoeficienteRendimento();
	}
}
