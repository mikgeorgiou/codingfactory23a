package ExerciseForSwitch;

import java.util.Scanner;

/**
 * Εκτυπώνει απο n εώς 1 αστεράκια, σε φθίνουσα σειρά.
 * Ο αριθμός των αστεριών δίνεται απο τον χρήστη.
 */
public class StarsFromN {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfStars = 0;

        System.out.println("Please insert number of Stars");
        numberOfStars = in.nextInt();

        for (int i = 1; i <= numberOfStars; i++) {
            for (int j = i; j <= numberOfStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

