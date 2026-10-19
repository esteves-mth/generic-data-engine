package br.com.esteves.engine.repository;

import br.com.esteves.engine.exception.IdDuplicadoException;
import br.com.esteves.engine.model.Identificavel;

import java.util.*;


public class RepositorioEmMemoria<T extends Identificavel<ID>, ID> implements Repositorio<T, ID>{
    private Map<ID, T> bancoDeDados = new HashMap<>();

    @Override
    public void cadastrar(T item) throws IdDuplicadoException {
        if (item == null){
            throw new IllegalArgumentException("O Item não pode ser nulo");
        }
        if (item.getID() == null) {
            throw new IllegalArgumentException("O ID do item não pode ser nulo");
        }
        if (bancoDeDados.containsKey(item.getID())){
            throw new IdDuplicadoException("O ID já está cadastrado no sistema");
        } else {
            bancoDeDados.put(item.getID(), item);
        }
    }

    @Override
    public Optional<T> buscarPorID(ID id) {
        return Optional.ofNullable(bancoDeDados.get(id));
    }

    @Override
    public List<T> listarTodos() {
        List<T> lista = new ArrayList<>(bancoDeDados.values());
        return lista;
    }

    @Override
    public boolean removerPorId(ID id) {
        return bancoDeDados.remove(id) != null;
    }

    @Override
    public int contar() {
        return bancoDeDados.size();
    }
}
