package com.basic.livraria.entity;

public class Ebook extends Livro{

	private String walterMark;

	public Ebook() {
		
	}
	
	public Ebook(String nome, String descricao, double valor, Autor autor, String walterMark) {
		super(nome, descricao, valor, autor);
		this.walterMark = walterMark;
	}

	public String getWalterMark() {
		return walterMark;
	}

	public void setWalterMark(String walterMark) {
		this.walterMark = walterMark;
	}
	
	@Override
	public boolean aplicarDesconto(double porcentagem) {
		if(porcentagem > 0.15) {
			return false;
		}

		double desconto = getValor()*porcentagem;
		setValor(getValor() - desconto);
		return true;
		
	}
	
	
}
