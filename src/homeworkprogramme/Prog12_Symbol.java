package homeworkprogramme;
/*Write a program that tells us input value is number or an alphabet or symbol.*/
import java.util.Scanner;

public class Prog12_Symbol {
    public void inputValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character");
        char input = scanner.next().charAt(0);
        if (input>= 'A' && input <= 'Z'|| input>= 'a' && input <= 'z' ){
            System.out.println("This input is ALPHABET");
        } else if(input>= '0') {
            System.out.println("This input is NUMBER");

        } else {
            System.out.println("This is CHARACTER");
        }

    }

    public static void main(String[] args) {
        Prog12_Symbol input = new Prog12_Symbol();
        input.inputValue();
    }
}
