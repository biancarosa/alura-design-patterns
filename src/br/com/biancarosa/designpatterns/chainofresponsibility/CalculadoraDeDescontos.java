package br.com.biancarosa.designpatterns.chainofresponsibility;

import br.com.biancarosa.designpatterns.strategy.impostos.Item;
import br.com.biancarosa.designpatterns.strategy.impostos.Orcamento;

public class CalculadoraDeDescontos {

    public static void main(String[] args) {
        Desconto desconto1 = new DescontoParaMaisDeCincoItens();
        Desconto desconto2 = new DescontoPorMaisQueQuinhentosReais();
        Desconto semDesconto = new SemDesconto();

        desconto1.setProximo(desconto2);
        desconto2.setProximo(semDesconto);

        Orcamento orcamento = new Orcamento(700);

        System.out.println(desconto1.desconta(orcamento));

        for (int i = 0; i < 10; ++i) {
            Item item = new Item("A"+i, i*10);
            orcamento.adicionaItem(item);
        }
        System.out.println(desconto1.desconta(orcamento));

        Orcamento orcamentoSemDesconto = new Orcamento(10);
        System.out.println(desconto1.desconta(orcamentoSemDesconto));



    }

}
