package br.com.ada.correios.businessobject;
// Comuns (de até 15 dias), é cobrado a taxa de 5 reais
public class Comuns implements Entrega{

    @Override
    public Double getCobranca() {
        Double cobranca = 5.0;
        return cobranca;
    }
}
