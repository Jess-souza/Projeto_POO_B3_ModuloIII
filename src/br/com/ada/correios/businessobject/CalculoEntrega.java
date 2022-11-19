package br.com.ada.correios.businessobject;

import java.math.BigDecimal;

public class CalculoEntrega {
    public BigDecimal calculoEntrega(Entrega entrega) {
        return entrega.getCobranca();
    }
}
