import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {
    private List<Loan> loans = new ArrayList<>();
    private List<Book> books = new ArrayList<>();
    private List<Author> authors = Arrays.asList(
            new Author("Carl Gustav Jung", LocalDate.of(1875, 7, 26)),
            new Author("Clarice Lispector", LocalDate.of(1920, 12, 10)),
            new Author("Machado de Assis", LocalDate.of(1839, 6, 21))
    );

    public Library(){
        initializeBooks();
    }

    public List<Book> getBooks() {
        return books;
    }

    private void initializeBooks() {
        Author jung = authors.get(0);
        Author clarice = authors.get(1);
        Author machado = authors.get(2);

        books.add(new Book("O Livro Vermelho", jung));
        books.add(new Book("A Hora da Estrela", clarice));
        books.add(new Book("Dom Casmurro", machado));
        books.add(new Book("Tipos Psicológicos", jung));
        books.add(new Book("Perto do Coração Selvagem", clarice));
        books.add(new Book("Memórias Póstumas de Brás Cubas", machado));
        books.add(new Book("O Eu e o Inconsciente", jung));
        books.add(new Book("Laços de Família", clarice));
        books.add(new Book("Quincas Borba", machado));
    }

    public Loan loanBook(String bookId, String name){
        Book book = findBookById(bookId);

        if(book == null) throw new IllegalArgumentException("Livro não encontrado " + bookId);
        if(!book.isAvailable()) throw new IllegalArgumentException("Livro não disponível " + book.getTitle());
        if(name.isEmpty()) throw new IllegalArgumentException("Nome inválido");

        book.setAvailable(false);

        Loan loan = new Loan(book,name);
        loans.add(loan);

        return loan;
    }

    private Book findBookById(String bookId){
        return books.stream()
                .filter(book -> book.getId().equals(bookId))
                .findFirst()
                .orElse(null);
    }



}
