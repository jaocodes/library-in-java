import java.time.LocalDate;
import java.util.UUID;

public class Book {
    private String id;
    private String title;
    private Author author;
    private boolean isAvailable;
    private LocalDate createdAt;
    private LocalDate updatedAt;

    public Book(String title, Author author) throws IllegalArgumentException{
        if(title == null || title.trim().isEmpty()) throw new IllegalArgumentException("Book title cannot be empty");
        if(author.getId() == null ) throw new IllegalArgumentException("Author book cannot be undefined");
        LocalDate dateCreation = LocalDate.now();
        this.id = UUID.randomUUID().toString();
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        this.createdAt =  dateCreation;
        this.updatedAt = dateCreation;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
        updatedAt = LocalDate.now();
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author.getName();
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public LocalDate getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public String toString() {
        return """
        {
          "book": {
            "id": "%s",
            "title": "%s",
            "author": %s,
            "isAvailable": %s,
            "createdAt": "%td de %<tb de %<tY",
            "updatedAt": "%td de %<tb de %<tY"
          }
        }""".formatted(id, title, author, isAvailable, createdAt, updatedAt);

           /*     return String.format(
                "Book{id='%s', title='%s', %s, isAvailable='%s', createdAt='%td de %<tb de %<tY', updatedAt='%td de %<tb de %<tY' }",
                id, title, author, isAvailable, createdAt, updatedAt
        );*/
    }
}
