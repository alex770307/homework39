import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class MeetingMain {
    public static void main(String[] args) {

        List<Meeting> meetings = new ArrayList<>();

        meetings.add(new Meeting("Iwan", "Maria", LocalDateTime.of(2024, 8, 10, 14, 5)));
        meetings.add(new Meeting("Alexey", "Swetlana", LocalDateTime.of(2024, 8, 10, 16, 10)));
        meetings.add(new Meeting("Dmitry", "Olga", LocalDateTime.of(2024, 8, 10, 10, 20)));

        System.out.println("\nВсе встречи из списка:");
        meetings.forEach(System.out::println);



    }

    public static LocalTime calculateAverageStartTime(List<Meeting> meetings) {
      return  null;
    }
}
