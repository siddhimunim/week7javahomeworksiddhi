package homeworkprogramme;
/*Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
        any other alphabet should be invalid entry*/

import java.util.Scanner;

public class prog8_CityName {

    public static void city() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any Capital Alphabet letter from A to F");
        char city = obj.next().charAt(0);

        if (city == 'A' || city == 'a') {
            System.out.println("City is Ahmedabad");
        } else if (city =='b' || city == 'B') {
            System.out.println("City is Bombay");
        } else if (city == 'C' || city =='c' ) {
            System.out.println("City is Cochin");
        } else if (city == 'D'|| city =='d') {
            System.out.println("City is Delhi");
        } else if (city == 'E'|| city =='e') {
            System.out.println("City is Edinburg");
        } else if (city == 'F'|| city =='f') {
            System.out.println("City is Foridabad");
        } else {
            System.out.println("Invalid Entry");
        }
    }

    public static void main(String[] args) {
        city();
    }


}




