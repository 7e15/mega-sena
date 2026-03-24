import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class MegaSena {

    public static void main(String[] args) {
        Random generate = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();

        while (numbers.size() < 6) {
            int number = generate.nextInt(60) + 1;

            if (!numbers.contains(number)) {
                numbers.add(number);
            }
        }
        Collections.sort(numbers);

        for (int n : numbers) {
            System.out.println(n);
        }
    }
}