package homeworkprogramme;
//Write a java program that tells us that Input number is odd or even?//

import java.util.Scanner;

public class Prog6_OddEven {
    public static void oddeven(){
        Scanner obj =new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = obj.nextInt();
        if(num % 2 == 0){
            System.out.println("This is Even Number");
        } else{
            System.out.println("This is Odd Number");
        }

    }

    public static void main(String[] args) {

        oddeven();
    }
}
