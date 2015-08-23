package br.com.biancarosa.designpatterns.strategy.impostos;

import java.math.BigDecimal;

public class ICCC implements Imposto {

	@Override
	public BigDecimal calcula(Orcamento orcamento) {
		BigDecimal valor = orcamento.getValor();
		if (valor.compareTo(new BigDecimal("1000")) < 0) {
	        return valor.multiply(new BigDecimal(0.05));
		} else if (valor.compareTo(new BigDecimal("3000")) <= 0) {
	        return valor.multiply(new BigDecimal(0.07));
		}
        return valor.multiply(new BigDecimal(0.8)).add(new BigDecimal(30));
	}

}