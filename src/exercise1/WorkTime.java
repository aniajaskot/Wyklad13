package exercise1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WorkTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dzień rozpoczęcia pracy w formacie dd-MM-yyyy");
        String dateString = scanner.nextLine();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate = LocalDate.parse(dateString, dateFormatter);

        System.out.println("Podaj godzinę rozpoczęcia w formacie HH:mm");
        String timeString = scanner.nextLine();
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime localTime = LocalTime.parse(timeString, timeFormatter);

        System.out.println("Ile godzin pracujesz");
        int hoursAmount = scanner.nextInt();
        scanner.nextLine();

        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        LocalDateTime leaveTime = localDateTime.plusHours(hoursAmount);

        String leaveTimeString = leaveTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
        System.out.println("Wyjdziesz z pracy o " + leaveTimeString);
    }
}
