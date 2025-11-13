import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Deseja ver a Lista de livros? (S/N)");
            String answer = scan.nextLine();

            if (answer.equalsIgnoreCase("s")) {
                System.out.println("\n ----  LIVROS  ----");
                List<Book> books = library.getBooks();

                if (books.isEmpty()){
                    System.out.println("\n NENHUM LIVRO CADASTRADO");
                }
                books.forEach(book -> {
                    String printString = String.format("ID: %s - Título: %s - Autor: %s",book.getId(), book.getTitle(), book.getAuthor());
                    System.out.println(printString);
                });
            } else if (answer.equalsIgnoreCase("N")) {
                break; // Sai do loop
            }
        }

    }
}