import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random rand = new Random();
        int target = rand.nextInt(100) + 1;
        System.out.println("please enter a number:");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();
        int count = 1;
        while (!checkGuess(guess, target)) {
            guess = scanner.nextInt();
            count++;
        }
        System.out.println("congratulations! you've guessed " + count + " times!");
    }

    public static boolean checkGuess(int guess, int target) {
        if (guess > target) {
            System.out.println("it's bigger than the target");
            return false;
        } else if (guess < target) {
            System.out.println("it's smaller than the target");
            return false;
        } else {
            return true;
        }
    }
}
