package br.com.biancarosa.designpatterns.strategy.investimentos;

public class Conta {

	private Double saldo = 0.0;
	
	public Double getSaldo() {
		return this.saldo;
	}
	
	public void saca(Double valor) {
		this.saldo -= valor;
	}
	
	public void deposita(Double valor) {
		this.saldo += valor;
	}
}
