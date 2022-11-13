package br.com.ada.correios.businessobject;
//é cobrado a taxa de 25 reais, para todo o Brasil.
public class SedexHoje implements Entrega{
    @Override
    public Double getCobranca() {
        Double cobranca = 25.0;
        return cobranca;
    }
}
