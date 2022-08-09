import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SurgeEmailIDCreation {
    static int i = 1;
    public static String emailId(String fname, String lname, String dob,Set<String> employees){
        String id;
        if(!employees.contains(fname)){
                employees.add(fname);
                id = fname;
        }
        else if (!employees.contains(fname+lname.charAt(0))){
            employees.add(fname+lname.charAt(0));
            id = fname+lname.charAt(0);
        }
        else {
//            employees.add(fname + lname.charAt(0) + dob.substring(5));
            employees.add(fname + lname.charAt(0) + i);
            id = fname + lname.charAt(0) + i;
            i++;
        }
        return id;
    }
    public static void main(String[] args) {
        Set<String> employeeNames = new HashSet<>();
        employeeNames.add("Majula");
        employeeNames.add("Divya");
        employeeNames.add("Balamanchari");
        employeeNames.add("Pratiksha");
        Scanner sc = new Scanner(System.in);
        Set<String> employeeID = new HashSet<>();
        String id;
        int i = 1;
        while (i<=3){
            System.out.println("Please enter your first name");
            String firstName = sc.next();
            System.out.println("Please enter your first name");
            String lastName = sc.next();
            System.out.println("Please enter your DOB in dd/mm/yyyy format");
            String dateOfBirth = sc.next();
//            System.out.println("Please Click on submit button to generate your Email ID");
            id = emailId(firstName, lastName, dateOfBirth, employeeNames);
            employeeID.add(id+"@surgetechinc.in");
            i++;
        }
        System.out.println(employeeNames);
        System.out.println(employeeID);
    }
}
