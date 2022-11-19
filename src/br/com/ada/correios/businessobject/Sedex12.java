package br.com.ada.correios.businessobject;

import java.math.BigDecimal;

//é cobrado a taxa de 20 reais, para todo o Brasil.
public class Sedex12 implements Entrega{
    public void cobranca() {
        System.out.println("Para Entregas Sedex 12 (12 horas do dia seguinte), é cobrado a taxa de 20 reais, para todo o Brasil.");
    }
    @Override
    public BigDecimal getCobranca() {
        return new BigDecimal(20);
    }
}
