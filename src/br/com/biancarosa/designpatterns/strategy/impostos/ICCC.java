package br.com.biancarosa.designpatterns.strategy.impostos;

import java.math.BigDecimal;

public class ICCC implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		double valor = orcamento.getValor();
		if (valor < 1000) {
	        return valor * 0.05;
		} else if (valor < 3000) {
	        return valor * 0.07;
		}
        return (valor *  0.8) + 30;
	}

}