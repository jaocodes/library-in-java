# Library Management System

Um sistema simples de gerenciamento de biblioteca desenvolvido em Java que demonstra vários conceitos fundamentais da linguagem.

## Descrição do Projeto

Este projeto implementa um sistema de biblioteca que permite:
- Gerenciar autores e livros
- Realizar empréstimos de livros
- Controlar disponibilidade dos livros
- Interagir via interface de linha de comando

## Estrutura do Projeto

```
📦 Biblioteca Management System
├── 📄 Author.java      # Classe para representar autores
├── 📄 Book.java        # Classe para representar livros
├── 📄 Loan.java        # Classe para representar empréstimos
├── 📄 Library.java     # Classe principal do sistema
└── 📄 Main.java        # Classe com interface de usuário
```

## Conceitos de Java Demonstrados

### 1. **Programação Orientada a Objetos (POO)**
- **Encapsulamento**: Uso de modificadores `private` e métodos getters
- **Abstração**: Classes representam entidades do mundo real (Autor, Livro, Empréstimo)
- **Composição**: Relacionamentos entre classes (Livro contém Autor)

### 2. **Modificadores de Acesso**
```java
private final String id;        // Acesso restrito à própria classe
public String getId() {         // Método público para acesso controlado
    return id;
}
```

### 3. **Construtores e Validação**
```java
public Author(String name, LocalDate dateOfBirth) throws IllegalArgumentException {
    // Validações no construtor
    if(name == null || name.trim().isEmpty()) 
        throw new IllegalArgumentException("Author name cannot be empty");
}
```

### 4. **Imutabilidade**
```java
private final String id;  // Campo final - não pode ser alterado após inicialização
```

### 5. **Tratamento de Exceções**
```java
try {
    Loan loan = library.loanBook(answerId, aswerName);
} catch (IllegalArgumentException e) {
    System.out.println(e.getMessage());
}
```

### 6. **Collections Framework**
```java
private List<Loan> loans = new ArrayList<>();
private List<Book> books = new ArrayList<>();
```

### 7. **Streams API**
```java
return books.stream()
        .filter(book -> book.getId().equals(bookId))
        .findFirst()
        .orElse(null);
```

### 8. **Date and Time API (java.time)**
```java
private LocalDate dateOfBirth;
private LocalDate createdAt;
private LocalDate updatedAt;
```

### 9. **UUID Generation**
```java
this.id = UUID.randomUUID().toString();  // Identificador único universal
```

### 10. **Formatação de Strings**
```java
// Text Blocks (Java 15+)
return """
{
    "id": "%s",
    "name": "%s"
}""".formatted(id, name);
```

### 11. **Métodos Getter e Setter**
```java
public String getId() { return id; }           // Getter
public void setAvailable(boolean available) {  // Setter com lógica adicional
    isAvailable = available;
    updatedAt = LocalDate.now();
}
```

### 12. **Inicialização de Objetos**
```java
// Inicialização em bloco
private List<Author> authors = Arrays.asList(
    new Author("Carl Gustav Jung", LocalDate.of(1875, 7, 26)),
    new Author("Clarice Lispector", LocalDate.of(1920, 12, 10))
);
```

## Funcionalidades

### Sistema de Autores
- Criação de autores com validação
- Armazenamento de dados biográficos
- Geração de ID único

### Sistema de Livros
- Associação com autores
- Controle de disponibilidade
- Registro de datas de criação e atualização

### Sistema de Empréstimos
- Registro de empréstimos
- Controle de devoluções
- Validação de disponibilidade

## 🛠️ Tecnologias e Versões

- **Java**: Versão 21
- **java.time**: Para manipulação de datas
- **java.util**: Collections, UUID, Scanner

## 📝 Características de Qualidade

### Boas Práticas Implementadas
1. **Validação de dados** em construtores e métodos
2. **Encapsulamento** adequado dos atributos
3. **Nomenclatura clara** de classes e métodos
4. **Tratamento de erros** com mensagens descritivas
5. **Separação de responsabilidades** entre classes

### Padrões de Design
- **Domain Model**: Representação fiel do domínio da biblioteca
- **Repository Pattern**: Library atua como repositório de dados
- **Service Layer**: Separação entre lógica de negócio e interface

## Como Executar

```bash
# Compilar todos os arquivos .java
javac *.java

# Executar a aplicação
java Main
```

## Conceitos Avançados Demonstrados

### 1. **Text Blocks**
```java
// Formatação complexa de strings de forma legível
return """
{
    "book": {
        "id": "%s",
        "title": "%s"
    }
}""";
```

### 2. **Expressões Lambda**
```java
books.forEach(book -> {
    if(book.isAvailable()){
        // Processamento para cada livro disponível
    }
});
```

### 3. **Method Chaining**
```java
books.stream()
    .filter(book -> book.getId().equals(bookId))
    .findFirst()
    .orElse(null);
```

Este projeto serve como um excelente exemplo didático para entender conceitos fundamentais e intermediários de Java, mostrando como aplicá-los em um contexto real de desenvolvimento de software.