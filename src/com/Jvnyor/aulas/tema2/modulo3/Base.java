package com.Jvnyor.aulas.tema2.modulo3;

public class Base {
	protected int var_base;
	public Base ( ){
		var_base = -1;
	}
	protected void atualizarVarBase ( int valor ) {
		this.var_base = valor;
	}
	protected void imprimirVarBase ( ) {
		System.out.println ("O valor de var_base eh " + this.var_base );
	}
	protected void atualizarVarSub ( int valor ) {
		((Derivada)this).var_der = valor;
	}
	protected void imprimirVarSub ( ) {
		System.out.println ("O valor de var_der na subclasse eh " + ((Derivada)this).var_der );
	}
}