package br.com.ada.correios.teste;

import br.com.ada.correios.repository.Repository;
import br.com.ada.correios.modelo.Carteiro;
import br.com.ada.correios.modelo.Entrega;
import br.com.ada.correios.modelo.Postagem;
import br.com.ada.correios.modelo.Produto;

public class TesteRepository {
    public static void main(String[] args) {
        Repository<Carteiro> carteiroRepository = new Repository<>();
        Carteiro carteiro = new Carteiro();
        carteiroRepository.salvar(carteiro);
        carteiroRepository.buscar(carteiro);
        carteiroRepository.alterar(carteiro);
        carteiroRepository.deletar(carteiro);
        System.out.println("---------------------------//---------------------------");

        Repository<Entrega> entregaRepository = new Repository<>();
        Entrega entrega = new Entrega();
        entregaRepository.salvar(entrega);
        entregaRepository.buscar(entrega);
        entregaRepository.alterar(entrega);
        entregaRepository.deletar(entrega);
        System.out.println("---------------------------//---------------------------");

        Repository<Postagem> postagemRepository = new Repository<>();
        Postagem postagem = new Postagem();
        postagemRepository.salvar(postagem);
        postagemRepository.buscar(postagem);
        postagemRepository.alterar(postagem);
        postagemRepository.deletar(postagem);
        System.out.println("---------------------------//---------------------------");

        Repository<Produto> produtoRepository = new Repository<>();
        Produto produto = new Produto();
        produtoRepository.salvar(produto);
        produtoRepository.buscar(produto);
        produtoRepository.alterar(produto);
        produtoRepository.deletar(produto);
    }
}