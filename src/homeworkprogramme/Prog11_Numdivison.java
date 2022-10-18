package homeworkprogramme;
/*Write a java program to print the numbers between 1 to 100 which can be divided by 3
        and 5 separately.*/

import java.util.Scanner;

public class Prog11_Numdivison {
    public static void number() {
        System.out.println(" Ans for division of num 3 : ");
        for (int x = 1; x <= 100; x++) {
            if (x % 3 == 0) {
                System.out.println( x + ", ");
            }
        }
            System.out.println(" Ans for division of num 5 : ");
            for(int x = 1; x <= 100; x++){
            if (x % 5 == 0) {

                System.out.print(x + ", ");
            }

        }

    }

    public static void main(String[] args) {
        number();
    }
}