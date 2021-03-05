package com.basic.livraria.entity;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeCupons {

	private Map<String, Double> cupons = new HashMap<>();

	public GerenciadorDeCupons() {
		
		cupons.put("CUP874", 0.15);
		cupons.put("CUP178", 0.10);
		cupons.put("CUP353", 0.05);
		cupons.put("CUP189", 0.20);
		cupons.put("CUP091", 0.25);
		cupons.put("CUP786", 0.30);
	}

	public Map<String, Double> getCupons() {
		return cupons;
	}

	public Double validarCupom(String cupom) {
		return this.cupons.get(cupom);
	}

}
