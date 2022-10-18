package homeworkprogramme;
/*Write a java program input sales id, seller's name, sales amount, and salary basic and
        then fined this sales
        Commission
        Sales amount >= 50,000 35%
        Sales amount >= 30,000 20%
        >= 20,000 10%
        >= 10,000 5%
        < 10,000 2%*/
import java.util.Scanner;

public class
Prog7_Commission {
    public static void commission(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Seller's name");
        String name = scanner.nextLine();
        System.out.println("Enter SalesID");
        double salesId = scanner.nextDouble();
        System.out.println("Enter Sales Amount");
        int salesamount = scanner.nextInt();
        System.out.println("Enter Basic Salary");
        int salary = scanner.nextInt();

        if(salesamount>=50000) {
            System.out.println("sales commission is " + salesamount * 35 / 100);
        } else if(salesamount>=30000){
            System.out.println("sales commission is " + salesamount * 20 / 100);

        }else if(salesamount>=20000){
            System.out.println("sales commission is " + salesamount * 10/ 100);

        }else if(salesamount>=10000){
            System.out.println("sales commission is " + salesamount * 5 / 100);

        }else if(salesamount>=10000){
            System.out.println("sales commission is " + salesamount * 2 / 100);

        }


    }

    public static void main(String[] args) {
        commission();
    }
}
