package br.com.ada.correios.teste;

import br.com.ada.correios.businessobject.Comuns;
import br.com.ada.correios.businessobject.Sedex12;
import br.com.ada.correios.businessobject.SedexHoje;
import br.com.ada.correios.repository.Repository;

public class TesteCorreios {
    public static void main(String[] args) {
        Repository<Integer> postagem = new Repository<>(1232);
        postagem.buscar();
        postagem.deletar();
        postagem.salvar();

        SedexHoje sedexHoje = new SedexHoje();
        sedexHoje.getCobranca();

        Comuns comuns = new Comuns();
        comuns.getCobranca();

        Sedex12 entregaSedex12 = new Sedex12();
        entregaSedex12.getCobranca();
    }
}