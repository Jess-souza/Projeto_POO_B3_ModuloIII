package br.com.ada.correios.businessobject;

import java.math.BigDecimal;

// Comuns (de até 15 dias), é cobrado a taxa de 5 reais
public class Comuns implements Entrega {
    public void cobranca() {
        System.out.println("Para Entregas Comuns (de até 15 dias), é cobrado a taxa de 5 reais, para todo o Brasil.");
    }

    @Override
    public BigDecimal getCobranca() {
        return new BigDecimal(5);
    }
}
