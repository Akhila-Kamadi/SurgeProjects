package SurgePackage1;

public class Surge {
    String address = "3rd Floor, 55/5, Vijaya Raghava Rd, Parthasarathi Puram, T. Nagar, Chennai, Tamil Nadu 600017";

    private void printAddress() {
        System.out.println("Here is the address of \"Surge IT Technology Solutions Pvt Ltd\".");
        System.out.println(address);
    }

    //method without access modifier is default modifier
    void callprint() {
        //private method calling in another method of same class
        printAddress();
    }
    //Public method can be accessed anywhere.
    public void printAddressOfSurge(){
        printAddress();
    }
    //protected can be accessed anywhere within a package or in subclass of other package that inherits this class
    protected void printAddressProtected(){
        printAddress();
    }
}
class July20th {
    public static void main(String[] args) {
        Surge sg = new Surge();
        // private methods or members can be accessed only in the class itself
        // even the other classes of the same package cannot access the private members or methods.
//        sg.printAddress();//Compile-Time Error: 'printAddress()' has private access in 'SurgePackage1.Surge'

        sg.callprint();//calls printAddress() method which prints the address of Surge Tech
        //Default access modifiers can be accessed only within the same package

        sg.printAddressOfSurge();//public method

        sg.printAddressProtected();//protected method
    }
}
