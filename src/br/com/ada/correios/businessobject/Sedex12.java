package br.com.ada.correios.businessobject;
//é cobrado a taxa de 20 reais, para todo o Brasil.
public class Sedex12 implements Entrega{
    @Override
    public void cobranca() {
        System.out.println("Para Entregas Sedex 12 (12 horas do dia seguinte), é cobrado a taxa de 20 reais, para todo o Brasil.");
    }
}
