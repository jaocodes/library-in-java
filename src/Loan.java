import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public class Loan {
    private String id;
    private Book book;
    private String clientName;
    private LocalDate loanDate;
    private  LocalDate returnDate;

    public Loan(Book book, String clientName) {
        this.id = UUID.randomUUID().toString();
        this.book = book;
        this.clientName = clientName;
        this.loanDate = LocalDate.now();
        this.returnDate = null;
    }

    public String getId() {
        return id;
    }

    public Book getBook() {
        return book;
    }

    public String getClientName() {
        return clientName;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public String toString() {
        String returnDateString = returnDate == null ? "null" : String.format("%td de %<tb de %<tY", returnDate);

        return """
        {
          "loan": {
            "id": "%s",
            "book": "%s",
            "clientName": %s,
            "loanDate": "%td de %<tb de %<tY",
            "returnDate": "%s"
          }
        }""".formatted(id, book, clientName, loanDate, returnDateString);
    }
}
