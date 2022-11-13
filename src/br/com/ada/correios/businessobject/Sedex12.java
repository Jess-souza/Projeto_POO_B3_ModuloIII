package br.com.ada.correios.businessobject;
//é cobrado a taxa de 20 reais, para todo o Brasil.
public class Sedex12 implements Entrega{
    @Override
    public Double getCobranca() {
        Double cobranca = 20.0;
        return cobranca;
    }
}
