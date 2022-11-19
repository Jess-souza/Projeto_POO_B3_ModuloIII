package br.com.ada.correios.businessobject;

import java.math.BigDecimal;

//é cobrado a taxa de 25 reais, para todo o Brasil.
public class SedexHoje implements Entrega {
    @Override
    public void getCobranca() {
        BigDecimal valorEntrega = new BigDecimal(25.0);
        System.out.println("Para Entregas Sedex Hoje (mesmo dia), é cobrado a taxa de " + valorEntrega + " reais, para todo o Brasil.");
    }
}
