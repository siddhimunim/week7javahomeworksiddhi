package homeworkprogramme;

public class Prog19_AvgArrays {
    public static void avg(){
        int num[] = {10, 20, 25, 35, 45};
        int sum = 0;
        int length = num.length;

        for (int x = 0; x < num.length; x++) {
            sum = sum + num[x];
        }
        double avarage = sum/length;
        System.out.println("Aarage of arrays = " + avarage);
    }

    public static void main(String[] args) {
        avg();
    }
}
