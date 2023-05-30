package ExerciseForSwitch;

import java.util.Scanner;

/**
 * Εμφανίζει ίσο αριθμό αστεριών κάθετα και οριζόντια (nxn).
 * Ο αριθμός n των αστεριών εισάγεται απο τον χρήστη.
 */

public class StarsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfStars = 0;

        System.out.println("Please insert number of stars");
        numberOfStars = in.nextInt();

        for (int i = 1; i <= numberOfStars; i++) {
            for (int j = 1; j <= numberOfStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
