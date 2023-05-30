package ExerciseForSwitch;

import java.util.Scanner;

/**
 * Εκτυπώνει n οριζόντια αστεράκια.
 * Τα αστεράκια n εισάγονται απο τον χρήστη.
 */
public class StarsHorizontal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfStars = 0;
        int i = 1;

        System.out.print("Please insert number of Stars");
        numberOfStars = in.nextInt();

        while (i <= numberOfStars) {
            System.out.print('*');
            i++;
        }
    }
}
