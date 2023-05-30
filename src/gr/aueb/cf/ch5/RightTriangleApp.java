package gr.aueb.cf.ch5;

/**
 *  Λαμβάνει 3 τιμές double από τον χρήστη, τις
 * a , b, c όπου a είναι η υποτείνουσα και
 * b, c οι δυο πλευρές.
 *
 * Ελέγχει αν το τρίγωνο είναι ορθογώνιο, δηλ. \
 * a^2 == b^2 + c^2
 *
 * Έστω EPSILON =0.000005 (έξι σημαντικά ψηφία).
 */

import java.util.Scanner;

public class RightTriangleApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double c;
        final double EPSILON = 0.000005;
        boolean isRight = false;


        System.out.println("Please insert three doubles");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        if (Math.abs(a*a -b*b -c*c) <= EPSILON) {
            System.out.println("Triangle is Right");
        } else {
            System.out.println("Triangle is NOT Right");
        }
    }
}
