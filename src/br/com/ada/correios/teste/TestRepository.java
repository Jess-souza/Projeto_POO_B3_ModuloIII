package br.com.ada.correios.teste;

import br.com.ada.correios.businessobject.Comuns;
import br.com.ada.correios.businessobject.Sedex12;
import br.com.ada.correios.businessobject.SedexHoje;
import br.com.ada.correios.modelo.Produto;
import br.com.ada.correios.repository.Repository;

public class TestRepository {
    public static void main(String[] args) {
        Repository<Produto> produtoRepository = new Repository<>();
        Produto produto = new Produto();
        produtoRepository.salvar(produto);
        produtoRepository.alterar(produto);
        produtoRepository.buscar(produto);
        produtoRepository.deletar(produto);

    }
}