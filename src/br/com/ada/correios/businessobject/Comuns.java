package br.com.ada.correios.businessobject;

import java.math.BigDecimal;
public class Comuns implements Entrega {
    @Override
    public void getCobranca() {
        BigDecimal valorEntrega = new BigDecimal(5.0);
        System.out.println("Para Entregas Comuns (de até 15 dias), é cobrado a taxa de " + valorEntrega + " reais, para todo o Brasil.");
    }
}
