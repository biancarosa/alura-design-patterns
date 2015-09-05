package br.com.biancarosa.designpatterns.strategy.impostos;

import java.math.BigDecimal;


public class ISS implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}
	
	
}