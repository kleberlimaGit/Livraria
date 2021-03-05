package com.basic.livraria.entity;

public class MiniLivro extends Livro {
	
	
	public MiniLivro() {
		super();
	}
	
	@Override
	public boolean aplicarDesconto(double porcentagem) {
		return false;
	}



}
