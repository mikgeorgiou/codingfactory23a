package gr.aueb.cf.ch7;

public class ForStringApp {

    public static void main(String[] args) {
        String s = "Coding Factory";

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i) + "");
        }

        System.out.println("\u2764");

        for (char ch : s.toCharArray()) {
            System.out.println(ch + " ");
        }

        System.out.println("\u2764");

        int index = s.indexOf("o", 7);
        System.out.println(index);
        System.out.println(index);

        if (s.startsWith("Coding")) System.out.println("Coding Factory");
    }
}
