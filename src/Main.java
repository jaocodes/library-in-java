import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        try {
            Author jung = new Author("Carl Jung", LocalDate.of(1875, Month.JULY,26));
            System.out.println(jung);

            Book jungBook = new Book("O Desenvolvimento da Personalidade", jung);

            System.out.println(jungBook);
        } catch (IllegalArgumentException e) {
            System.out.println("Inserção de dados incorreta");
        }


    }
}