package homeworkprogramme;

import java.util.Arrays;

/*Write a Java program to sort a numeric array and a string array.*/
public class Prog17_SortArrays {
    public static void sortA(){
         int num [] ={2,88,98,70,60};
         String car[] ={"Volvo", "Mercedes", "Minicooper","BMW ","Discovery" };

         //convert arrays into string//
        Arrays.toString(num);
        Arrays.toString(car);
        //print original arrays//
        System.out.println( Arrays.toString(num));
        System.out.println( Arrays.toString(car));
        // sort now to alphabetical//

        Arrays.sort(num);
        Arrays.sort(car);
        // print with sorting//

        System.out.println( Arrays.toString(num));
        System.out.println( Arrays.toString(car));

    }

    public static void main(String[] args) {
        sortA();
    }
}
