package br.com.biancarosa.designpatterns.strategy.investimentos;

import java.util.Random;

public class Moderado implements PerfilDeInvestimento {

	@Override
	public Double calculaJuros(Double valor) {
		Double random = new Random().nextDouble();
		if (random < 0.50) {
			return valor * 0.025;
		}
		return valor * 0.007;
	}
	
	
}
