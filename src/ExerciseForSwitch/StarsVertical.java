package ExerciseForSwitch;

import java.util.Scanner;

/**
 * Εκτυπώνει κάθετα n αστεράκια.
 * Ο αριθμός n εισάγεται απο τον χρήστη.
 */
public class StarsVertical {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int numberOfStars = 0;
        int i = 1;

        System.out.print("Please insert number of stars");
        numberOfStars = in.nextInt();

        while (i <= numberOfStars) {
            System.out.println("*");
            i++;
        }
    }
}
