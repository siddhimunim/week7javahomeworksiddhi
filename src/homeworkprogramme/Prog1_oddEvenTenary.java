package homeworkprogramme;

import java.util.Scanner;
/*Write a java program that tells us that Input number is odd or even?*/
public class Prog1_oddEvenTenary {
    public static void oddEven(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Number");
        int num = scanner.nextInt();
        String result = (num % 2==0) ? "Even " : "Odd";
        System.out.println("Number is:"+ result);
    }

    public static void main(String[] args) {

        oddEven();
    }
}
