package br.com.esteves.engine.repository;

import br.com.esteves.engine.exception.IdDuplicadoException;
import br.com.esteves.engine.model.Identificavel;

import java.util.List;
import java.util.Optional;

public interface Repositorio <T extends Identificavel<ID>, ID> {
    void cadastrar(T item) throws IdDuplicadoException;
    Optional<T> buscarPorID(ID id);
    List<T> listarTodos();
    boolean removerPorId(ID id);
    int contar();

}
