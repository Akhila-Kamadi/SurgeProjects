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


//        -----------------Arrays---------------------
        int[][] employeeMarks = {{90,80,70},{95,85,75},{90,85,80}};
        for (int empNames[]: employeeMarks) {
            for (int mark: empNames) {
                System.out.print(mark+" ");
            }
            System.out.println();
        }
        int[][] marksArr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                System.out.println("Enter marks of employee "+ (i+1) + " : ");
                int marks = sc.nextInt();
                marksArr[i][k] = marks;
            }
        }
        for (int e = 0; e < 3; e++) {
            for (int m = 0; m < 3; m++) {
                System.out.print(marksArr[e][m]+" ");
            }
            System.out.println();
        }



        //=======================19 table using Loops===================

        //---------For loop--------------------
        int val = 19;
        for (int i = 1; i <= 10; i++) {
            System.out.println(val + " * " + i +" = " + val * i);
        }
        //----------------while loop---------------
        int x = 1;
        while(x<=10){
            System.out.println(val + " * " + x +" = " + val * x);
            x++;
        }

        //----------do-while loop----------------
        int k = 1;
        do {
            System.out.println(val + " * " + k +" = " + val * k);
            k++;
        }while(k<=10);
    }
}
