package com.basic.livraria;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.basic.livraria.entity.Autor;
import com.basic.livraria.entity.CarrinhoDeCompras;
import com.basic.livraria.entity.Ebook;
import com.basic.livraria.entity.GerenciadorDeCupons;
import com.basic.livraria.entity.Livro;
import com.basic.livraria.entity.LivroFisico;
import com.basic.livraria.entity.Produto;

public class CadastroDeLivros {

	public static void main(String[] args) {
		Autor autor = new Autor("Pedro Ricardo", "Pedro.lima@gmail.com", "123.456.789-10");
		Livro livro = new LivroFisico("POO JAVA","livro de JAVA", 69.99, autor);
		livro.setIsbn("978-85-66250-46-6");
		
		Livro ebook = new Ebook("JAVA 8","livro básico de POO", 29.99, autor,"PL");
			
		System.out.println(livro.toString());
		System.out.println(ebook.toString());
		
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(livro);
		carrinho.adiciona(ebook);
		
		
		System.out.println("Total da compra: " + carrinho.getTotal());
		
		List<Produto> produtos = Arrays.asList(livro,ebook);
		List<Livro> livros = Arrays.asList(livro, ebook);
		livros.sort(
			(l1,l2) -> l1.getNome().compareTo(l2.getNome()));
		
		for(Produto produto : produtos) {
			System.out.println(produto.getValor());
		}
		
		GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();
		Double desconto = gerenciador.validarCupom("CUP786");
		if(desconto != null) {
			livro.aplicarDesconto(desconto);
			ebook.aplicarDesconto(desconto);
			System.out.println("Valor do Livro com desconto: R$" + livro.getValor());
			System.out.println("Valor do Ebook com desconto: R$" + ebook.getValor());
		}else {
			System.out.println("Este cupom não é válido");
		}
		System.out.println("----------------");
		
		livros.forEach(l -> System.out.println(l.getNome()));
		System.out.println("----------------");
		System.out.println("----------------");
		livros.stream().filter(l -> l.getNome().contains("8")).collect(Collectors.toList()).forEach(l -> System.out.println(l.getNome()));
		
	}
	
	
	
	
}
