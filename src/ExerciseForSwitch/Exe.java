package ExerciseForSwitch;

import java.util.Scanner;

public class Exe {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n;
        int result;

        System.out.println("Please insert n");
        n = in.nextInt();

        Horizontal(n);

    }
    public static void Horizontal(int n) {

        for(int i = 1; i <= n; i++) {
            System.out.print("*");;
        }
    }
}
