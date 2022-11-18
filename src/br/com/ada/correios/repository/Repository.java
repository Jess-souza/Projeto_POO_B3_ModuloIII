package br.com.ada.correios.repository;

public class Repository<T> {
    public void salvar(T t) {
        System.out.println("Salvando dados do(a) " + t);
    }

    public void alterar(T t) {
        System.out.println("Alterando dados do(a) " + t);
    }

    public void buscar(T t) {
        System.out.println("Buscando dados do(a) " + t);
    }

    public void deletar(T t) {
        System.out.println("Deletando dados do(a) " + t);
    }
}