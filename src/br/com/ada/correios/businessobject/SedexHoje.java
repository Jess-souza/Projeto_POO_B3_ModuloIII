package br.com.ada.correios.businessobject;

import java.math.BigDecimal;

//é cobrado a taxa de 25 reais, para todo o Brasil.
public class SedexHoje implements Entrega {

    public void cobranca() {
        System.out.println("Para Entregas Sedex Hoje (mesmo dia), é cobrado a taxa de 25 reais, para todo o Brasil.");
    }

    @Override
    public BigDecimal getCobranca() {
        return new BigDecimal(25);
    }
}
