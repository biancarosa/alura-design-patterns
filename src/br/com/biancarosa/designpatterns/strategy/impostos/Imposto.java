package br.com.biancarosa.designpatterns.strategy.impostos;

import java.math.BigDecimal;

public interface Imposto {

    double calcula(Orcamento orcamento);

}