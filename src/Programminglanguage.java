import java.time.LocalDate;
import java.util.Objects;

public class Programminglanguage {
    private String name;
    private String author;
    private LocalDate dateOfFirstVersion;

    public Programminglanguage(String name, String author, LocalDate dateOfFirstVersion) {
        this.name = name;
        this.author = author;
        this.dateOfFirstVersion = dateOfFirstVersion;
    }

    @Override
    public String toString() {
        return "Programminglanguage{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", dateOfFirstVersion=" + dateOfFirstVersion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Programminglanguage that = (Programminglanguage) o;
        return Objects.equals(name, that.name)
                && Objects.equals(author, that.author)
                && Objects.equals(dateOfFirstVersion, that.dateOfFirstVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, dateOfFirstVersion);
    }

    public LocalDate getDateOfFirstVersion() {
        return dateOfFirstVersion;
    }
}
