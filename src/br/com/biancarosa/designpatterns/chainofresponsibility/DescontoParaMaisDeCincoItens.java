package br.com.biancarosa.designpatterns.chainofresponsibility;

import br.com.biancarosa.designpatterns.strategy.impostos.Orcamento;

public class DescontoParaMaisDeCincoItens implements Desconto {

    private Desconto proximo;


    @Override
    public double desconta(Orcamento orcamento) {
        if (orcamento.getItens().size() > 5) {
            return orcamento.getValor() * 0.1;
        }
        return proximo.desconta(orcamento);
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}
