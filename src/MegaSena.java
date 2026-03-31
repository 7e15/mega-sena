import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class MegaSena {

    public static void main(String[] args) {
        System.out.println("Ola! Seja bem vindo ao gerador de numeros da MegaSena!");
        System.out.println("Os numeros de hoje sao:");

        GerarNumeros();
        MensagemFinal();
    }

    public static void GerarNumeros() {
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

    public static void MensagemFinal() {
        System.out.println("Boa sorte!");
    }
}