# Generic Data Engine

Repositório genérico em memória desenvolvido em Java. O projeto implementa o padrão Repository de forma reutilizável, permitindo cadastrar, buscar, listar e remover qualquer tipo de entidade que implemente a interface `Identificavel`.

## Tecnologias

- Java 17
- Maven
- JUnit 5

## Estrutura do projeto

```
src/main/java/br/com/esteves/engine/
├── model/
│   ├── Identificavel.java
│   ├── Produto.java
│   └── Aluno.java
├── repository/
│   ├── Repositorio.java
│   └── RepositorioEmMemoria.java
└── exception/
    └── IdDuplicadoException.java
```

## Como funciona

A interface Identificavel<ID> exige que toda entidade possua um método getID().
O RepositorioEmMemoria usa um HashMap para armazenar os dados e oferece as operações:

- cadastrar(T item) — adiciona um item (lança exceção se o ID já existir)
- buscarPorID(ID id) — retorna um Optional
- listarTodos() — retorna todos os itens
- removerPorId(ID id) — remove pelo ID
- contar() — retorna a quantidade de itens

### Exemplos de entidades

- Produto — ID do tipo Long
- Aluno — ID do tipo String

## Como executar

1. Clone o repositório
2. Compile com Maven:
   
   ```
   mvn clean compile
   ```
3. Execute os testes:
   
   ```
   mvn test
   ```
   
## O que foi praticado

- Generics e interfaces genéricas
- Padrão Repository
- Collections (HashMap, ArrayList)
- Tratamento de exceções customizadas
- Validação de dados nos construtores
- Testes unitários com JUnit 5
- Organização de projeto com Maven
