package com.basic.livraria.entity;


public class LivroFisico extends Livro{

	public LivroFisico(String nome, String descricao, double valor, Autor autor) {
		super(nome,descricao,valor,autor);
	}
	
	public double getTaxaImpressao() {
		return this.getValor()*0.05;
	}

	@Override
	public boolean aplicarDesconto(double porcentagem) {
		if(porcentagem > 0.3) {
			return false;
		}
		double desconto = getValor()*porcentagem;
		setValor(getValor() - desconto);
		return true;
			
	}
	
	
}
