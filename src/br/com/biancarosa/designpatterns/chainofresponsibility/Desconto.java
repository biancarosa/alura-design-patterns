package br.com.biancarosa.designpatterns.chainofresponsibility;

import br.com.biancarosa.designpatterns.strategy.impostos.Orcamento;

public interface Desconto {

    double desconta(Orcamento orcamento);
    void setProximo(Desconto proximo);

}
