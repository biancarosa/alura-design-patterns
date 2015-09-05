package br.com.biancarosa.designpatterns.strategy.impostos;

import java.math.BigDecimal;

public class CalculadorDeImposto {
	
	static void calculaImposto(Orcamento orcamento, Imposto imposto) {
		double valorDoImposto = imposto.calcula(orcamento);
		
		System.out.println(valorDoImposto);
	}
	
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(50);
		
		calculaImposto(orcamento, new ICMS());
		
		calculaImposto(orcamento, new ISS());
	}
	
}