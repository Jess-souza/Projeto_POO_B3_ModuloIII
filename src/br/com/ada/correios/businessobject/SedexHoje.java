package br.com.ada.correios.businessobject;
//é cobrado a taxa de 25 reais, para todo o Brasil.
public class SedexHoje implements Entrega{
    @Override
    public void getCobranca() {
        System.out.println("Para Entregas Sedex Hoje (mesmo dia), é cobrado a taxa de 25 reais, para todo o Brasil.");
    }
//    @Override
//    public void getCobranca() {
//        Double cobranca = 25.0;
//        System.out.println("O valor da entrega Sedex Hoje é: " + cobranca);
//    }


}
