package homeworkprogramme;
/*input any year like (ex.2007) and find out if it is leap year or
import java.util.Scanner;*/

import java.util.Scanner;

public class Prog2_LeapYear {
    public void year() {
        Scanner obj = new Scanner(System.in);
        System.out.println("Please enter any year  ");
        int year = obj.nextInt();
        if (year % 4 == 0  || year % 100 != 0) {                             // if year divided by 4then //
            System.out.println("This is Leap Year");
        }else if(year% 400==0){
            System.out.println("This is Leap Year");
        }
        else {
            System.out.println("This is not Leap Year");
        }

    }

    public static void main(String[] args) {
        Prog2_LeapYear obj= new Prog2_LeapYear();
        obj.year();

    }
}


