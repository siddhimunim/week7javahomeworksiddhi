package homeworkprogramme;

import java.util.Scanner;

/* Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
“ZERO”*/
public class prog16_PosNegZero {
    public static void number(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scanner.nextInt();
        if(num<0){
            System.out.println("This Number is Negative");
        }
        else if(num> 0){
            System.out.println("This Number is Positive");
        } else if (num==0){
            System.out.println("This Number is Zero");
        }

    }

    public static void main(String[] args) {
        number();
    }
}
