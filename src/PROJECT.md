# Sistema de Gerenciamento de Empréstimos de Biblioteca

## Objetivo

Desenvolver um sistema de console para gerenciar o empréstimo de livros de uma biblioteca. O programa deverá interagir com o usuário, permitindo que ele veja os livros disponíveis e realize o empréstimo de um deles.

## Como deve funcionar

1. **Início**: O programa começará, em loop, perguntando ao usuário se ele deseja ver a lista de livros disponíveis.
2. **Listagem**: Se a resposta for "SIM", o sistema exibirá no console uma lista com os livros que não foram emprestados.
3. **Empréstimo**: Após ver a lista, o usuário poderá escolher um livro pelo seu id, informar o próprio nome e, assim, registrar o empréstimo. O sistema deve confirmar a operação com uma mensagem de sucesso e marcar o livro como indisponível.

4. **Encerramento**: Se a resposta inicial for "NÃO", ou após a conclusão de um empréstimo, o sistema deve exibir uma mensagem de despedida e finalizar a execução.

## Estrutura do Projeto

O projeto será dividido em algumas classes simples para manter a organização. Aqui estão as classes principais e suas funcionalidades:

### Book
- `id`: Identificador único do livro
- `title`: Título do livro
- `author`: Autor do livro (objeto do tipo Author)
- `isAvailable`: Indica se o livro está disponível para empréstimo
- `createdAt`: Data que o livro foi cadastrado
- `updatedAt`: Data que o livro foi atualizado

### Author
- `id`: Identificador único do autor
- `name`: Nome do autor
- `dateOfBirth`: Nascimento do autor

### Loan
- `id`: Identificador único do empréstimo
- `book`: Livro que foi emprestado (objeto do tipo Book)
- `clientName`: Nome do cliente que pegou o livro emprestado
- `loanDate`: Data que o empréstimo foi realizado
- `returnDate`: Data que o livro foi devolvido (pode ser nula se ainda não foi devolvido)

### Library
- `loans`: Lista de empréstimos da biblioteca
- `books`: Lista de livros na biblioteca
- `authors`: Lista de autores da biblioteca

```java
import java.util.ArrayList;

public class Library {
    private List<Loan> loans = new ArrayList<>();
    private List<Book> books = new ArrayList<>();
    private List<Author> authors = new ArrayList<>();
}

```