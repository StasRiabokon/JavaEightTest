import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class JavaEightTest {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 1, 2, 8, 5, 6);


        System.out.println("List:");
        numbers.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.print(integer+" ");
            }
        });

        System.out.println();
        numbers.forEach(el -> System.out.print(el + " "));
        System.out.println();

        System.out.println("Sorted list:");
        Collections.sort(numbers, (o1, o2) -> o1.compareTo(o2));
        numbers.forEach(System.out::println);

        int result = numbers.stream().mapToInt(val -> val).sum();
        System.out.println("Sum of a list of values: " + result);

        System.out.println("sum of even a list of values: " + numbers.stream().filter(val -> val % 2 == 0).mapToInt(val -> val).sum());

        LocalDate time = LocalDate.now();
        Period period = Period.ofDays(2);
        LocalDate newDate = time.plus(period);
        System.out.println("year: " + newDate.getYear());
        System.out.println("month: " + newDate.getMonth());
        System.out.println("day: " + newDate.getDayOfMonth());
    }


}
