package br.com.ada.correios.teste;

import br.com.ada.correios.businessobject.*;

public class TesteEntregas {
    public static void main(String[] args) {
        CalculoEntrega calculoEntrega = new CalculoEntrega();
        System.out.println(calculoEntrega.calculoEntrega(new Sedex12()));
        System.out.println(calculoEntrega.calculoEntrega(new Comuns()));
        System.out.println(calculoEntrega.calculoEntrega(new SedexHoje()));
    }
}
