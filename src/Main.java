import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max= 100;

        Random r = new Random();
        int secret = r.nextInt(max - min) + min; //0 - 100 的隨機數字
        System.out.println("The secret number is:" + secret);


        while (true) {
            System.out.println("Make a guess (between " + min + " and " + max + "): ");
            int guess = scanner.nextInt();

            if(guess < min || guess > max) {
                System.out.println("Please make a valid guess");
                continue;
            }

            if(guess == secret) {
                System.out.println("You win!! The secret number is "+ secret);
            } else if ( guess < secret) {
                min = guess;
            } else {
                max = guess;
            }

        }

    }
}