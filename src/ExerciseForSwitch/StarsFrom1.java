package ExerciseForSwitch;

import java.util.Scanner;

/**
 * Εκτυπώνει απο 1 εώς n αστεράκια, σε αύξουσα σειρά.
 * Ο αριθμός των αστεριών δίνεται απο τον χρήστη.
 */
public class StarsFrom1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfStars = 0;

        System.out.println("Please insert number of Stars");
        numberOfStars = in.nextInt();

        for (int i = 1; i <= numberOfStars; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
