package br.com.ada.correios.teste;

import br.com.ada.correios.repository.Repository;

public class TesteCorreios {
    public static void main(String[] args) {
        Repository<Integer> postagem = new Repository<>(1232);
        postagem.buscar();
        postagem.deletar();
        postagem.salvar();
    }
}