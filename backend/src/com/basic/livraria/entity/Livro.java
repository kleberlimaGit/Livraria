package com.basic.livraria.entity;

public abstract class Livro implements Produto{

	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;

	public Livro() {
		this.isbn = "000-00-00000-00-0";
	}

	public Livro(String nome, String descricao, double valor, Autor autor) {
		this();
		this.nome = nome;
		this.descricao = descricao;
		this.valor = valor;
		this.autor = autor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	public abstract boolean aplicarDesconto(double porcentagem);
	
	public boolean temAutor() {
		return this.autor != null;
	}

	
	
	
	
	@Override
	public int compareTo(Produto produto02) {
		
		return Double.compare(this.getValor(), produto02.getValor());
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Mostrando detalhes do Livro" + "\n");
		sb.append("Nome: " + nome + "\n");
		sb.append("descricao: " + descricao + "\n");
		sb.append("Valor : R$ " + valor + "\n");
		sb.append("ISBN: " + isbn + "\n");
		if(this.temAutor()) {
			sb.append("Livro escrito por: "+ autor.getNome() + "\n");
			sb.append("Para entrar em contato envie email para: "+ autor.getEmail() + "\n");
		}
		sb.append("--" + "\n");
		return sb.toString();
	}
	
	
}
