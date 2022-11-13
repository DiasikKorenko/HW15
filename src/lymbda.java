import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class lymbda {
    public static void main(String[] args) {
        Predicate<String> yesORno = str -> ((str.startsWith("J") || str.startsWith("N")) && str.endsWith("A"));
        System.out.println(yesORno.test("Jjhbfvfb"));
        Box box = new Box();
        Consumer<Integer> pr = n -> System.out.println("Отгрузили ящик с весом " + n + "кг.");
        pr.accept(box.n);
        Consumer<Integer> whatNumber = number -> {
            if (number > 0) {
                System.out.println("Число " + number + " положительное");
            } else if (number == 0) {
                System.out.println("Ноль");
            } else {
                System.out.println("Число " + number + " отрицательное");
            }
        };
        whatNumber.accept(8);
        Supplier<Double> random = () -> {
            double a = Math.random() * 10;
            return a;
        };
        double result = random.get();
        System.out.println("Рандомное число от 0 - 10: " + (int) result);
    }
}
