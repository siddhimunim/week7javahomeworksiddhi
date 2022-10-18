package homeworkprogramme;

/*18. Write a Java program to sum values of an array.*/
public class Prog18_SumArrays {
    public static void sumArrays() {
        // arrays number//
        int num[] = {10, 20, 25, 35, 45};
        int sum = 0;

         for (int x = 0; x < num.length; x++) {
            sum = sum + num[x];
        }
        System.out.println("Sum of all input of arrays =" + sum);
    }

    public static void main(String[] args) {
        sumArrays();
    }


}

