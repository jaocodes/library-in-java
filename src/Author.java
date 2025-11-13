import java.time.LocalDate;
import java.util.UUID;

public class Author {
    private final String id;
    private String name;
    private LocalDate dateOfBirth;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Author (String name, LocalDate dateOfBirth) throws IllegalArgumentException {

        if(name == null || name.trim().isEmpty()) throw new IllegalArgumentException("Author name cannot be empty");
        if(dateOfBirth == null || dateOfBirth.isAfter(LocalDate.now())) throw new IllegalArgumentException("Author date of birth cannot be null or in a future date");

        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String toString(){
        return """
        {
          "id": "%s",
          "name": "%s",
          "dateOfBirth": "%td de %<tb de %<tY"
        }""".formatted(id, name, dateOfBirth);

        /*return String.format(
                "Author{id='%s', name='%s', dateOfBirth='%td de %<tb de %<tY'}",
                id,name,dateOfBirth);*/
    }

}
