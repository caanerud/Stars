/**
 * Created by chrisaanerud on 3/1/17.
 * Edited by James
 */
// This file creates stars in a really cool pattern!
public class Main {
    public static void main(String[] args) {
        int height = 10;
        for (int rows = 1; rows <= height;rows++) {
            for (int whiteSpaces =1;whiteSpaces <= (height-rows);whiteSpaces++) {
                System.out.print(" ");
            }
            for (int stars = 1;stars <=(rows * 2 - 1);stars++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


