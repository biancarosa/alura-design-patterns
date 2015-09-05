package br.com.biancarosa.designpatterns.chainofresponsibility;

import br.com.biancarosa.designpatterns.strategy.impostos.Orcamento;

public class DescontoPorMaisQueQuinhentosReais implements Desconto {

    private Desconto proximo;

    @Override
    public double desconta(Orcamento orcamento) {
        if (orcamento.getValor() > 500) {
            return orcamento.getValor() * 0.07;
        }
        return proximo.desconta(orcamento);
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}
