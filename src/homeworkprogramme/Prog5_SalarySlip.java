package homeworkprogramme;

/*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
        salary
        HRA = basic salary 10%
        DA = Basic salary 8%
        TA = Basic salary 9%
        PF= Basic salary 20%
        Gross salary = basic salary + HRA + TA + DA –PF
        Print in following format
        _____________________________________
        |           Salary Slip             |
        |___________________________________|
        | Employee Id :      2564           |
        | Employee Name :     Jay           |
        |___________________________________|
        | Basic Salary   :       25000.0    |
        | HRA 10%        :       2500.0     |
        | TA 8%          :       2250.0     |
        | DA 9%          :       2000.0     |
        | PF - 20&       :       5000.0     |
        |___________________________________|
        | Gross Salary   :       26750.0    |*/


import java.util.Scanner;

public class Prog5_SalarySlip {
    public static void salary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Employee Name");
        String empName = scanner.nextLine();
        System.out.println("Enter your Employee Id");
        int empId = scanner.nextInt();

        System.out.println("Enter your basic salary");
        int salary = scanner.nextInt();
        float hra = salary * 10 / 100;
        float da = salary * 8 / 100;
        float ta = salary * 9 / 100;
        float pf = salary * 20 / 100;
        float grosssalary = salary + hra + da + ta - pf;
        scanner.close();

        System.out.println("  ___________________________________");
        System.out.println(" |           Salary Slip             |");
        System.out.println(" |___________________________________|");
        System.out.println(" | Employee Id   :" + empId +   "               |");
        System.out.println(" | Employee Name :" + empName + "                |");
        System.out.println(" |___________________________________|");
        System.out.println(" | Basic Salary  :" + salary + "              |");
        System.out.println(" | HRA 10%       :" + hra + "             |");
        System.out.println(" | TA 8          :" + ta + "             |");
        System.out.println(" | DA 9%         :" + da + "             |");
        System.out.println(" | PF - 20&      :" + pf + "             |");
        System.out.println(" |___________________________________|");
        System.out.println(" | Gross Salary :" + grosssalary + "             |");
        System.out.println(" |===================================|");


    }

    public static void main(String[] args) {
        salary();

    }

}
