package br.com.ada.correios.teste;

import br.com.ada.correios.businessobject.Comuns;
import br.com.ada.correios.businessobject.Sedex12;
import br.com.ada.correios.businessobject.SedexHoje;
import br.com.ada.correios.modelo.Produto;
import br.com.ada.correios.repository.Repository;

public class TestCorreios {
    public static void main(String[] args) {
        Repository<Produto> produtoRepository = new Repository<>();
        Produto produto = new Produto();
        produtoRepository.salvar(produto);
        produtoRepository.alterar(produto);
        produtoRepository.buscar(produto);
        produtoRepository.deletar(produto);

        SedexHoje sedexHoje = new SedexHoje();
        sedexHoje.cobranca();

        Sedex12 sedex12 = new Sedex12();
        sedex12.cobranca();

        Comuns comuns = new Comuns();
        comuns.cobranca();
    }
}