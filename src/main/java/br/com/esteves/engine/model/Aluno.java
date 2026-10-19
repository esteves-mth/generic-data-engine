package br.com.esteves.engine.model;

public class Aluno implements Identificavel<String> {
    private final String id;
    private final String nome;
    private final String turma;
    private final double nota;

    public Aluno(String id, String nome, String turma, double nota) {
        if (id == null){
            throw new IllegalArgumentException("O ID não pode ser nulo");
        } if (id.trim().isEmpty()){
            throw new IllegalArgumentException("O ID não pode estar vazio");
        } if (nome == null){
            throw new IllegalArgumentException("O nome não pode ser nulo");
        } if (nome.trim().isEmpty()){
            throw new IllegalArgumentException("O nome não pode estar vazio");
        }if (turma == null){
            throw new IllegalArgumentException("A turma não pode ser nula");
        } if (turma.trim().isEmpty()){
            throw new IllegalArgumentException("A turma não pode estar vazia");
        } if (nota < 0){
            throw new IllegalArgumentException("A nota não pode ser menor que 0");
        } if (nota > 10){
            throw new IllegalArgumentException("A nota não pode ser maior que 10");
        } if (Double.isInfinite(nota)){
            throw new IllegalArgumentException("A nota não pode ser infinito");
        } if (Double.isNaN(nota)){
            throw new IllegalArgumentException("A nota não pode ser NaN");
        }

        this.id = id;
        this.nome = nome;
        this.turma = turma;
        this.nota = nota;
    }

    @Override
    public String getID(){
        return this.id;
    }
    public String getNome(){
        return this.nome;
    }
    public String getTurma(){
        return this.turma;
    }
    public double getNota(){
        return this.nota;
    }
}
