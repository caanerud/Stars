import java.util.Scanner;

/**
 * Created by chrisaanerud on 3/1/17.
 * Edited by James
 */
// This file creates stars in a really cool pattern!
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("****THE AMAZING STAR PRINTER***");
        System.out.println("How many Rows would you like? (q to quit) : ");
        while (sc.hasNextInt()) {
            int height = sc.nextInt();
            for (int rows = 1; rows <= height;rows++) {
                for (int whiteSpaces =1;whiteSpaces <= (height-rows);whiteSpaces++) {
                    System.out.print(" ");
                }
                for (int stars = 1;stars <=(rows * 2 - 1);stars++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("");
            System.out.println("How many Rows would you like? (q to quit): ");

        }
        System.out.println("Come Back Soon!");

    }

}
