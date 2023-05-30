package ExerciseForSwitch;

import java.util.Scanner;

public class MenuStars {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;

        do {
            printMenu();
            choice = getNextInt("Please insert your choice");

            //validation
            if (isChoiceInvalid(choice)) {
                System.out.println("Choice is invalid");
                continue;
            }

            if (isChoiceQuit(choice)) {
                break;
            }

            onChoiceGetResult(choice);

        } while(true);
    }

    public static void printMenu() {
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 – n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n – 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");
    }

    public static int getNextInt(String pleaseInsertYourChoice) {
        System.out.println(pleaseInsertYourChoice);
        return in.nextInt();
    }

    public static boolean isChoiceInvalid(int choice) {
        return choice < 1 || choice > 6;
    }

    public static boolean isChoiceQuit(int choice) {
        return choice == 6;
    }

    /**
     * Εκτυπώνει τον αριθμό των αστεριών που δίνει ο χρήστης οριζόντια.
     *
     * @param n     number of stars, given by the user.
     */
    public static void horizontal(int n) {

        for(int i = 1; i <= n; i++) {
            System.out.print("*");
        }
    }

    /**
     * Εκτυπώνει τον αριθμό των αστεριών που δίνει ο χρήστης κάθετα.
     *
     * @param n     number of stars, given by the user.
     */
    public static void vertical(int n) {

        for(int i= 1;i <= n; i++) {
            System.out.println("*");
        }
    }

    /**
     * Εκτυπώνει ίσο αριθμό αστεριών κάθετα και οριζόντια.
     *
     * @param n     number of stars, given by the user.
     */
    public static void equalStars(int n) {

        for (int i = 1; i <= n; i++) {
            horizontal(n);
            System.out.println();
        }
    }



    /**
     * Εκτυπώνει απο 1 εώς n αστέρια, με αύξουσα σειρά.
     *
     * @param n  number of stars, given by the user.
     */
    public static void starsAsc(int n) {

        for (int i = 1; i <= n; i++) {
            horizontal(i);
            System.out.println();
        }
    }

    /**
     * Εκτυπώνει απο n εώς 1 αστέρια, με φθίνουσα σειρά.
     *
     * @param n     number of stars, given by the user.
     */
    public static void starsDesc(int n) {

        for (int i =n; i >= 1; i--) {
            horizontal(i);
            System.out.println();
        }
    }

    public static void onChoiceGetResult(int choice) {
        int n = getNextInt("Please insert the number of Stars n (int)");
        int result = 0;

        switch(choice){
            case 1:
                horizontal(n);
                System.out.println();
                break;
            case 2:
                vertical(n);
                break;
            case 3:
                equalStars(n);
                break;
            case 4:
                starsAsc(n);
                break;
            case 5:
                starsDesc(n);
                break;
            case 6:
            default:
                break;
        }
    }
}
