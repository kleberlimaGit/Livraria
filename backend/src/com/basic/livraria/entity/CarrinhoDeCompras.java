package com.basic.livraria.entity;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Produto> produtos = new ArrayList<>();
	private double total;

	public CarrinhoDeCompras() {

	}

	public CarrinhoDeCompras(List<Produto> produtos, double total) {
		this.produtos = produtos;
		this.total = total;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public double getTotal() {
		return total;
	}
	
	
	public void adiciona(Produto produto){
		this.produtos.add(produto);
	}
	
	public void remove(int posicao){
		this.produtos.remove(posicao);
	}

}
