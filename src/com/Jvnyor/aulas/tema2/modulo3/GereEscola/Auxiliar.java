package com.Jvnyor.aulas.tema2.modulo3.GereEscola;

public abstract class Auxiliar {
	//Atributos
	private float freq;
	private final int dias_letivos;
	private int presenca;
	//Métodos
	public Auxiliar ( int dias_letivos ) {
		this.dias_letivos = dias_letivos;
	}
	protected final void calcularFrequencia ( ) {
		freq = 100 * ( presenca / dias_letivos );
	}
	protected float recuperarFrequencia ( ) {
		return freq;
	}
	protected abstract float calcularMedia ( );
}