package br.com.biancarosa.designpatterns.strategy.investimentos;

public class RealizadorDeInvestimentos {

	public void investe(PerfilDeInvestimento perfilDeInvestimento, Conta conta) {
		Double juros = perfilDeInvestimento.calculaJuros(conta.getSaldo());

		System.out.println(juros);
		
		conta.deposita(juros * 0.75);
	}
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.deposita(100d);
		
		Conservador conservador = new Conservador();
		
		RealizadorDeInvestimentos realizadorDeInvestimentos = new RealizadorDeInvestimentos();
		
		realizadorDeInvestimentos.investe(conservador, conta);
		
		System.out.println(conta.getSaldo());
	}
}
