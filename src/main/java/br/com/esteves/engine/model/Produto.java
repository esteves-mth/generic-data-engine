package br.com.esteves.engine.model;

public class Produto implements Identificavel<Long> {
    private final Long id;
    private final String nome;
    private final String categoria;
    private final double preco;

    public Produto(Long id, String nome, String categoria, double preco) {
        if (id == null){
            throw new IllegalArgumentException("O ID não pode ser nulo");
        } if (nome == null){
            throw new IllegalArgumentException("O nome não pode ser nulo");
        } if (nome.trim().isEmpty()){
            throw new IllegalArgumentException("O nome não pode estar vazio");
        } if (categoria == null){
            throw new IllegalArgumentException("A categoria não pode ser nula");
        } if (categoria.trim().isEmpty()){
            throw new IllegalArgumentException("A categoria não pode estar vazia");
        } if (preco < 0){
            throw new IllegalArgumentException("O preço não pode ser menor que 0");
        } if (Double.isInfinite(preco)){
            throw new IllegalArgumentException("O preço não pode ser infinito");
        } if (Double.isNaN(preco)){
            throw new IllegalArgumentException("O preço não pode ser NaN");
        }

        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    @Override
    public Long getID(){
        return this.id;
    }
    public String getNome() {
        return this.nome;
    } public String getCategoria() {
        return this.categoria;
    } public double getPreco() {
        return this.preco;
    }
}