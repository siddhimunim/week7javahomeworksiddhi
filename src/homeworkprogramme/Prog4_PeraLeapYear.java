package homeworkprogramme;
/*Number of Days In Month
        Write a method isLeapYear with a parameter of type int named year.
        The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
        If the parameter is not in that range return false.
        Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
        otherwise return false.
        A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
        Example of input/Output:
        ● isLeapYear(-1600); should return false since the parameter is not in the range(1-9999)
        ● isLeapYear(1600); should return true since 1600 is a leap year
        ● isLeapYear(2017); should return false since 2017 is not a leap year
        ● isLeapYear(2000);should return true because 2000 is a leap year
        Write another method getDaysInMonth with two parameter month and year. Both of type
        int.
        If parameter month is < 1 or >12 return -1.
        If parameter year is <1 or >9999 than return -1.
        This method needs to return the number of days in the month. Be careful about leap years
        they have 29 days in month 2 (February).
        You should check if the year is a leap year using the method isLeapYear describe above.

        Example of input/Output:
        ● getDaysInMonth(1, 2020); should return 31 since January has 31 days.
        ● getDaysInMonth(2, 2020); should return 29 since February has 29 days in a year and 2020 is a leap
        year.
        ● getDaysInMonth(2, 2018); should return 28 since February has 28 days if it’s not a leap year and
        2018 is not a leap year.
        ● getDaysInMonth(-1, 2020); should return -1 since the parameter month is invalid.
        ● getDaysInMonth(1, -2020); should return -1 since the parameter year is outside the range of 1 to 9999*/

import java.util.Scanner;

public class Prog4_PeraLeapYear {


    public static void isLeapYear(int year) {


        if (year < 1 || year > 9999) {
            System.out.println("FALSE");

        } else if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("TRUE");
        } else if (year % 400 == 0) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }

    public static void getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            System.out.println("-1");
        }

        switch (month) {
            case 1:
                if (year < 1 || year > 9999) {
                    System.out.println("");
                } else {

                    System.out.println("31 days in January");
                    break;
                }

            case 2:
                if (year < 1 || year > 9999) {

                } else if (year % 4 == 0 && year % 100 != 0) {
                    System.out.println("February has 29 days as it is Leap Year");
                } else if (year % 400 == 0) {
                    System.out.println("February has 29 days as it is Leap Year");
                } else {
                    System.out.println("February has 28 days as it is not aLeap Year");
                }
                break;
            case 3:
                if (year < 1 || year > 9999) {
                    System.out.println("");
                } else {

                    System.out.println("31 days in March");
                    break;
                }
            case 4:
                if (year < 1 || year > 9999) {
                    System.out.println("");
                } else {

                    System.out.println("30 days in April");
                    break;
                }
            case 5:
                if (year < 1 || year > 9999) {
                    System.out.println("");
                } else {

                    System.out.println("31 days in May");
                    break;
                }
            case 6:
                if (year < 1 || year > 9999) {
                    System.out.println("");
                } else {

                    System.out.println("30 days in June");
                    break;
                }
            case 7:
                if (year < 1 || year > 9999) {
                    System.out.println("");
                } else {

                    System.out.println("31 days in July");
                    break;
                }
            case 8:
                if (year < 1 || year > 9999) {
                    System.out.println("");
                } else {

                    System.out.println("31 days in August");
                    break;
                }
            case 9:
                if (year < 1 || year > 9999) {
                    System.out.println("");
                } else {

                    System.out.println("30 days in September");
                    break;
                }
            case 10:
                if (year < 1 || year > 9999) {
                    System.out.println("");
                } else {

                    System.out.println("31 days in october");
                    break;
                }
            case 11:
                if (year < 1 || year > 9999) {
                    System.out.println("");
                } else {

                    System.out.println("30 days in November");
                    break;
                }
            case 12:
                if (year < 1 || year > 9999) {
                    System.out.println("");
                } else {

                    System.out.println("31 days in December");
                    break;
                }

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any year");
        int year = scanner.nextInt();
        System.out.println("Enter any month and year");
        int month = scanner.nextInt();

        isLeapYear(year);
        getDaysInMonth(month, year);


    }
}




