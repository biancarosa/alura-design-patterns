package br.com.biancarosa.designpatterns.strategy.investimentos;

import java.util.Random;

public class Arrojado implements PerfilDeInvestimento {

	@Override
	public Double calculaJuros(Double valor) {
		Double random = new Random().nextDouble();
		if (random < 0.20) {
			return valor * 0.05;
		}
		if (random < 0.5) {
			return valor * 0.03;
		}
		return valor * 0.006;
	}
	
	
}
