import java.util.Random;
import java.util.Scanner;

public class QuesssingGame {
    public static void main(String[] args) {


        Random rand = new Random();
        int secretNum = rand.nextInt(10)+ 1;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("I have chosen a number between 1 to 10.Try to guess it.");
                int guess;

        do {
            System.out.println("Your guess:");
            guess = keyboard.nextInt();

            if (guess == secretNum) {

                System.out.println("Thats's right! you're a good guesser.");
                break;

            } else {

                System.out.println("That is incorrect.Guess again.");
            }


        } while (guess != secretNum);

    }
}
