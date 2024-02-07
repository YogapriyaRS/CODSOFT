import java.util.Random;
import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int score = 0;
        boolean retry = true;
        while (retry) {
            int guess = rand.nextInt(100) + 1;
            int attempts = 0;
            System.out.println("Welcome to the Number Guessing World!");
            System.out.println("Guess a number between 1 and 100:");
            while (attempts < 5) {  // You can adjust the number of attempts as needed
                int input = sc.nextInt();
                attempts++;
                if (input == guess) {
                    System.out.println("Congratulations, you guessed the number!");
                    System.out.println("Attempts: " + attempts);
                    score += (6 - attempts);  // Score calculation (more points for fewer attempts)
                    break;
                } else {
                    int difference = Math.abs(input - guess);
                    if (difference == 0) {
                        System.out.println("Congratulations, you guessed the number!");
                        System.out.println("Attempts: " + attempts);
                        score += (6 - attempts);  // Score calculation (more points for fewer attempts)
                        break;
                    } else if (Math.abs(input - guess) <=5) {
                        int closeness = input - guess;
                        System.out.println("You are close to the number. You are closer by " + Math.abs(closeness) +
                                " (" + (closeness > 0 ? "subtract " : "add ") + Math.abs(closeness)+" to get closer). Try again:");
                    } else if (input  < guess) {
                        System.out.println("Your guess is too low. Try again:");
                    } else {
                        System.out.println("Your guess is too high. Try again:");
                    }
                }
            }

            System.out.println("The correct number was: " + guess);
            System.out.println("Your current score: " + score);

            System.out.println("Do you want to play again? (yes/no):");
            String replay = sc.next().toLowerCase();
            retry = replay.equals("yes");
        }

        System.out.println("Thanks for playing! Your final score is: " + score);
        sc.close();
    }
}
