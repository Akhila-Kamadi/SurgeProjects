package SurgePackage1;
public class DefaultProtected {
    public static void main(String[] args) {
        Surge sg = new Surge();
        sg.printAddressProtected();//accessing default method in other class within the same package
        sg.printAddressOfSurge();//accessing public method in other class within the same package
    }
}
