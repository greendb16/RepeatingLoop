import java.util.Scanner;

public class RepeatingLoop {
    static public void main(String[]args) {
        Scanner key = new Scanner(System.in);
        int secretNumber, guess;

        secretNumber = 123;
        System.out.println("I'm thinking of a number between 1 and 1000");
        System.out.println("Enter the number:  ");
        guess = key.nextInt();

        while (guess != secretNumber && guess != 5) {
            System.out.println("\nYou are wrong.  Try again.\n\nEnter the number:  ");
            guess = key.nextInt();

        }
            System.out.println("You are correct.  You win a prize!!");
        }
    }
