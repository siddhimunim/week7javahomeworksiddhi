package homeworkprogramme;
/*Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
        any other alphabet should be invalid entry*/

import java.util.Scanner;

// switch method//
public class prog9_SwitchCityMethod {

    public static void city() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Capital letter from A to F");
        char city = obj.next().charAt(0);
        switch (city) {
            case 'A':
                System.out.println("City is Amritsir");
                break;
            case 'B':
                System.out.println("City is Banglore");
                break;
            case 'C':
                System.out.println("City is Chennai");
                break;
            case 'D':
                System.out.println("City is Darjiling");
                break;
            case 'E':
                System.out.println("City is Edinbrough");
                break;
            case 'F':
                System.out.println("City is Faridabad");
            default:
                System.out.println("Invalid Entry");
        }
    }

    public static void main(String[] args) {
        city();
    }
}
