package br.com.ada.correios.businessobject;

import java.math.BigDecimal;
public class Sedex12 implements Entrega {
    @Override
    public void getCobranca() {
        BigDecimal valorEntrega = new BigDecimal(20.0);
        System.out.println("Para Entregas Sedex 12 (12 horas do dia seguinte), é cobrado a taxa de " + valorEntrega + " reais, para todo o Brasil.");
    }
}
