package gr.aueb.cf.ch6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * array Populate from file.
 */
public class PopulateFromFile {

    public static void main(String[] args) throws FileNotFoundException {
        File File = new File("C:/tmp/intfile.txt");
        Scanner in = new Scanner(new File("C:/tmp/intfile.txt"));
        int[] grades = new int[5];

        for (int i =0; i < grades.length; i++) {
            grades[i] = in.nextInt();
        }

        for (int grade : grades) {
            System.out.print(grade + "");
        }

    }
}
