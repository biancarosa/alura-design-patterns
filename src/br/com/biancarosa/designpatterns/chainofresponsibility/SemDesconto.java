package br.com.biancarosa.designpatterns.chainofresponsibility;

import br.com.biancarosa.designpatterns.strategy.impostos.Orcamento;

public class SemDesconto implements Desconto {

    private Desconto proximo;


    @Override
    public double desconta(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setProximo(Desconto proximo) {
    }
}
