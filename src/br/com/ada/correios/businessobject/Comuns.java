package br.com.ada.correios.businessobject;

// Comuns (de até 15 dias), é cobrado a taxa de 5 reais
public class Comuns implements Entrega {

    @Override
    public void cobranca() {
        System.out.println("Para Entregas Comuns (de até 15 dias), é cobrado a taxa de 5 reais, para todo o Brasil.");
    }

}
