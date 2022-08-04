package SurgePackage2;

import SurgePackage1.Surge;

public class July20Assignment extends Surge {
    public static void main(String[] args) {
        Surge sg2 = new Surge();
        //callPrint() method is default method which can accessed in within same package.
        //Hence it throws error
//       sg2.callPrint();//Compile-time Error: Cannot resolve method 'callPrint' in 'Surge'
        sg2.printAddressOfSurge();//accesses printAddressOfSurge() method from surge class
                                 // which has printAddress() method
                                //and prints address
        System.out.println();

//        sg2.printAddressProtected();//Gives compile-time error
        //'printAddressProtected()' has protected access in 'SurgePackage1.Surge'
        //For accessing protected method  we have to extend the class that contains protected members in another package.

        July20Assignment assignment = new July20Assignment();
        assignment.printAddressProtected();//prints address

    }
}
