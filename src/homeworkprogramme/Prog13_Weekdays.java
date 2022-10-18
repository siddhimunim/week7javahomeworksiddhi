package homeworkprogramme;
/*Write a Java program which input any number between 1 to 7 and it print The Days
        name MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch.*/

import java.util.Scanner;

public class Prog13_Weekdays {
    public static void days() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please Enter number between 1 to 7");
        int day = obj.nextInt();

        switch (day) {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is wednesday");
                break;

            case 4:
                System.out.println("Today is Thursday");
                break;


            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;

            default:
                System.out.println("Week contains 1 to 7 days");
                obj.close();
        }


    }

    public static void main(String[] args) {
        days();
    }


}
