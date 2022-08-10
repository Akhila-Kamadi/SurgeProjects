package SurgeTraining;

import java.util.Scanner;

public class TrainingDay1 {
    static String emailExtension = "surgetechinc.in";
    public static void main(String[] args) {
        //==========Use of static====================
        System.out.println("Employee name : ");
        Scanner sc = new Scanner(System.in);
        String empName = sc.next();
        System.out.println("The Employee email ID is "+empName+"@"+emailExtension);
        //===================LOOPS========================
        System.out.println("Enter no of employees : ");
        int no_of_emps = sc.nextInt();
        for (int i = 0; i <= no_of_emps; i++) {
            System.out.println("employee number : "+i);
        }
//        for (int i: no_of_emps) {//error:foreach not applicable to type 'int'
//
//        }
        int j = no_of_emps;
        while(j<=no_of_emps){
            System.out.println("employee number : "+j);
            j++;
        }
        do {
            System.out.println("employee number : "+j);
            j++;
        }while (j<=no_of_emps);

        //-----------------Arrays---------------------
        int[][] employeeMarks = {{90,80,70},{95,85,75},{90,85,80}};
        for (int empNames[]: employeeMarks) {
            for (int mark: empNames) {
                System.out.print(mark+" ");
            }
            System.out.println();
        }
    }
}
