import javax.swing.*;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    private static Library library = new Library();
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        while (true){
            System.out.println("Deseja ver a Lista de livros? (S/N)");
            String answer = scan.nextLine().trim();

            if (answer.equalsIgnoreCase("s")) {
                showAvailableBooks();
                processLoan();
            } else if (answer.equalsIgnoreCase("N")) {
                System.out.println("Sistema de emprestimos será encerrado");

                break; // Sai do loop
            }
        }
        scan.close();
    }
    private static void showAvailableBooks(){
        System.out.println("\n ----  LIVROS  ----");
        List<Book> books = library.getBooks();

        if (books.isEmpty()){
            System.out.println("\n NENHUM LIVRO CADASTRADO");
        }
        books.forEach(book -> {
            if(book.isAvailable()){
                String printString = String.format("ID: %s - Título: %s - Autor: %s",book.getId(), book.getTitle(), book.getAuthor());
                System.out.println(printString);
            }
        });
    }

    private static void processLoan(){
            boolean isloopingLoan = true;
        while (isloopingLoan){
            System.out.println("Digite o ID do livro que deseja emprestar: ");
            String answerId = scan.nextLine().trim();

            System.out.println("Digite o seu nome para realizar o empréstimo: ");
            String aswerName = scan.nextLine().trim();

            try {
                Loan loan = library.loanBook(answerId,aswerName);
                String loanExecutedStr =  String.format("O livro '%s' foi emprestado para '%s' em %td de %<tb de %<tY ",loan.getBook().getTitle(),loan.getClientName(),loan.getLoanDate());
                System.out.println(loanExecutedStr);
                isloopingLoan =  false;

            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }



    }

}