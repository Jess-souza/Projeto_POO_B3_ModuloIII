package br.com.ada.correios.teste;

import br.com.ada.correios.businessobject.*;

public class TesteEntrega {
    public static void main(String[] args) {
        SedexHoje sedexHoje = new SedexHoje();
        Sedex12 sedex12 = new Sedex12();
        Comuns comuns = new Comuns();

        CalculoEntrega calculoEntrega = new CalculoEntrega();
        calculoEntrega.calculoEntrega(sedexHoje);
        calculoEntrega.calculoEntrega(sedex12);
        calculoEntrega.calculoEntrega(comuns);
    }
}
