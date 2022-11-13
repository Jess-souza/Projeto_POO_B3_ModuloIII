package br.com.ada.correios.repository;

public class Repository<T> {
    T obj;

    public Repository(T obj) {
        this.obj = obj;
    }

    public void salvar() {
        System.out.println(obj);
    }

    public void alterar() {
        System.out.println(obj);
    }

    public void buscar() {
        System.out.println(obj);
    }

    public void deletar() {
        System.out.println(obj);
    }
}
