package br.com.biancarosa.designpatterns.strategy.investimentos;

public class Conservador implements PerfilDeInvestimento {

	@Override
	public Double calculaJuros(Double valor) {
		return valor * 0.008;
	}
	
	
}
