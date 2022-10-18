package homeworkprogramme;

import java.util.Arrays;
import java.util.Scanner;

/*Write a Java program to test if an array contains a specific value.*/
public class Prog20_SpecificArrays {
    public static void specific() {
        int num[] = {10, 20, 30, 55, 40};
        Arrays.toString(num);

        System.out.println(Arrays.toString(num));
        Scanner scanner =new Scanner(System.in);
        int speNum = scanner.nextInt();

        for (int x = 0; x < num.length; x++) {
            if (speNum == num[x]) {
                System.out.println("This value in specific array");
            }

        }
        System.out.println("This value not in specific array");

    }

    public static void main(String[] args) {
        specific();
    }
}
