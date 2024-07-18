import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Programminglanguage> languages = new ArrayList<>();
        languages.add(new Programminglanguage("Java", "James Gosling", LocalDate.of(1995, 5, 23)));
        languages.add(new Programminglanguage("C", "Dennis Ritchie", LocalDate.of(1972, 5, 1)));
        languages.add(new Programminglanguage("Python", "Guido van Rossum", LocalDate.of(1991, 2, 20)));
        languages.add(new Programminglanguage("C++", "Bjarne Stroustrup", LocalDate.of(1985, 10, 1)));
        languages.add(new Programminglanguage("JavaScript", "Brendan Eich", LocalDate.of(1995, 12, 4)));
        languages.add(new Programminglanguage("Fortran", "John Backus", LocalDate.of(1957, 1, 1)));

        System.out.println("Все языки из списка:");
        languages.forEach(System.out::println);
        Programminglanguage oldestLanguage = languages.stream()
                .min(Comparator.comparing(Programminglanguage::getDateOfFirstVersion))
                .orElse(null);

        if (oldestLanguage != null) {
            System.out.println("Самый старый язык программирования: " + oldestLanguage);
        } else {
            System.out.println("Список языков программирования пуст.");
        }
    }
}
