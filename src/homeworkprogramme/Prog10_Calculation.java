package homeworkprogramme;

import java.util.Scanner;

/*Write a java program to input any two number and ask user to enter their symbol (+, -,
        /, *) find addition, Subtraction, multiplication and division according to their symbol
        (using if else)*/
public class Prog10_Calculation {
    public static void calculation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = scanner.nextDouble();
        System.out.println("Enter second number");
        double num2 = scanner.nextDouble();
        System.out.println("Enter the operations: +,-,*,/");
        char operation = scanner.next().charAt(0);
        if (operation == '+') {
            System.out.println("Answer is =" + (num1 + num2));
        } else if (operation == '-') {
            System.out.println("Answer is =" + (num1 - num2));

        } else if (operation == '*') {
            System.out.println("Answer is =" + (num1 * num2));
        } else if (operation == '/') {
            System.out.println("Answer is =" + (num1 / num2));

        }
    }

    public static void main(String[] args) {
        calculation();
    }
}