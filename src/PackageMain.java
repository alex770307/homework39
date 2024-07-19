import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PackageMain {
    public static void main(String[] args) {

        ZonedDateTime nowNewYork = ZonedDateTime.now(ZoneId.of("America/New_York"));
        ZonedDateTime nowTokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime nowLondon = ZonedDateTime.now(ZoneId.of("Europe/London"));
        ZonedDateTime nowMoscow = ZonedDateTime.now(ZoneId.of("Europe/Moscow"));
        ZonedDateTime nowSydney = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));

        List<Package> packages = new ArrayList<>();
        packages.add(new Package("New York", "Berlin", 2.5, nowNewYork.minusMinutes(5)));
        packages.add(new Package("Tokyo", "Berlin", 1.2, nowTokyo.minusMinutes(5)));
        packages.add(new Package("London", "Berlin", 3.0, nowLondon.minusMinutes(10)));
        packages.add(new Package("Moscow", "Berlin", 1.5, nowMoscow.minusMinutes(15)));
        packages.add(new Package("Sydney", "Berlin", 4.0, nowSydney.minusMinutes(5)));

        System.out.println("\nВсе посылки из списка:");
        packages.forEach(System.out::println);

        Package newestPackage = packages.stream()
                .filter(pkg -> pkg.getCityOfReceipt().equals("Berlin"))
                .max(Comparator.comparing(Package::getCreationDateTime))
                .orElse(null);

        if (newestPackage != null) {
            System.out.println("Самая новая посылка, отправляющаяся в Берлин: " + newestPackage);
        } else {
            System.out.println("Нет посылок, отправляющихся в Берлин.");
        }
    }
}

