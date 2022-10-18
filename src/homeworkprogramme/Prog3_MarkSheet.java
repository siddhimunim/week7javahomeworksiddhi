package homeworkprogramme;
/*Write a java program to input student Name, roll No, and three subjects Math, Science and
        English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
        Input, Marks should between 0 to 100”) and find out total, percentage and result.
        If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
        %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
        _______________________________
        |                             |
        |         Mark Sheet          |
        |_____________________________|
        |    Name     :      Jay      |
        | Roll No     :      08       |
        |_____________________________|
        | Subjects    :    Marks      |
        |_____________________________|
        | Math        :     98        |
        | Science     :     90        |
        | English     :     85        |
        |_____________________________|
        | Total       :     273       |
        |_____________________________|
        | Percentage  :     91.0      |
        | Result      :    Pass       |
        | Grade       :    A+         |
        |_____________________________|*/

import java.util.Scanner;

public class Prog3_MarkSheet {
    public static void result() {
        Scanner scanner = new Scanner(System.in);    // all information enter by user//
        System.out.println("Enter your Name ");
        String name = scanner.nextLine();
        System.out.println("Enter your rollnumber");
        int no = scanner.nextInt();
        System.out.println("Enter Maths marks");
        int maths = scanner.nextInt();
        System.out.println("Enter science marks");
        int science = scanner.nextInt();
        System.out.println("Enter English marks");
        int english = scanner.nextInt();
        int total = maths + science + english;
        double percentage = (total * 100) / 300;


        System.out.println("__________________________________");
        System.out.println("|                                |");
        System.out.println("|          Mark Sheet            |");
        System.out.println("|________________________________| ");
        System.out.println("|     Name     :" + name +         "              |");
        System.out.println("|   Roll No    :" + no + "                | ");
        System.out.println("|________________________________|");
        System.out.println("|   Subjects   :  Marks          |");
        System.out.println("|________________________________|");
       System.out.println("|   Math       :  " + maths + "             | ");
       System.out.println("|   Science    : " + science + "              |");
        System.out.println("|   English    :  " + english + "             |");
        if(maths<0||maths>100||science<0||science>100||english<0||english>100){
            System.out.println("Invalid marks");
            System.exit(0);
        }
        System.out.println("|________________________________|");
        System.out.println("|   Total      :  " + total + "            |");
        System.out.println("|________________________________|");
        System.out.println("|   Percentag  :  " + percentage + "           |");
        if (percentage >= 80) {
            System.out.println("|   Result     : Pass            |");
            System.out.println("|   Grade    :     A+           |");
        } else if (percentage >= 60) {
            System.out.println("|   Result     :  Pass          |");
            System.out.println("|   Grade      :  A             |");
        } else if (percentage >= 50) {
            System.out.println("|   Result     :  Pass          |");
            System.out.println("|   Grade      :  B             |");
        } else if (percentage >= 35) {
            System.out.println("|   Result     :  Pass          |");
            System.out.println("|   Grade      :  C             |");
        } else {
            System.out.println("|   Result     :  Fail          | ");
            System.out.println("|   Grade      :   N/A           |");
        }
        System.out.println("__________________________________");

    }

    public static void main(String[] args) {
        result();
    }

}
