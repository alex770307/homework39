import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PackageMain {
    public static void main(String[] args) {

        List<Package> packages = new ArrayList<>();

        packages.add(new Package("New York", "Berlin", 2.5,
                ZonedDateTime.of(LocalDateTime.of(2024, 7, 20, 10, 0),
                        ZoneId.of("America/New_York"))));

        packages.add(new Package("Tokyo", "Berlin", 3.0,
                ZonedDateTime.of(LocalDateTime.of(2024, 7, 20, 10, 0),
                        ZoneId.of("Asia/Tokyo"))));

        packages.add(new Package("Moscow", "Berlin", 1.2,
                ZonedDateTime.of(LocalDateTime.of(2024, 7, 20, 10, 0),
                        ZoneId.of("Europe/Moscow"))));

        packages.add(new Package("Sydney", "Berlin", 1.5,
                ZonedDateTime.of(LocalDateTime.of(2024, 7, 20, 10, 0),
                        ZoneId.of("Australia/Sydney"))));

        packages.add(new Package("London", "Berlin", 4.0,
                ZonedDateTime.of(LocalDateTime.of(2024, 7, 20, 10, 0),
                        ZoneId.of("Europe/London"))));

        packages.add(new Package("Paris", "Berlin", 4.0,
                ZonedDateTime.of(LocalDateTime.of(2024, 7, 20, 10, 0),
                        ZoneId.of("Europe/Paris"))));

        System.out.println("\nВсе посылки из списка:");
        packages.forEach(System.out::println);

        Package latestPackageToBerlin = packages.stream()
                .filter(pkg -> pkg.getCityOfReceipt().equalsIgnoreCase("Berlin"))
                .max(Comparator.comparing(Package::getCreationDateTimeInUTC))
                .orElse(null);

        if (latestPackageToBerlin != null) {
            System.out.println("\nСамая новая посылка в Берлин:\n" + latestPackageToBerlin);
        } else {
            System.out.println("Нет посылок, отправляющихся в Берлин.");
        }
    }
}

