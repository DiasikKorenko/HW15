import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws RuntimeException {
        Scanner sc = new Scanner(System.in);
        LocalDate date;
        System.out.print("Введите дату(пример 2022-10-24): ");
        date = LocalDate.parse(sc.nextLine());
        System.out.println("День недели: " + date.getDayOfWeek());
        if (date.getDayOfWeek().toString().equals("TUESDAY")) {
            System.out.println("Дата следующего вторника: " + date.plusDays(7));
        } else {
            while (!date.getDayOfWeek().toString().equals("TUESDAY")) {
                date = date.plusDays(1);
            }
            System.out.println("Дата следующего вторника: " + date);
        }
    }
}