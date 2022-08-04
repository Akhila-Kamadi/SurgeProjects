class SurgeTech{
    String address = "3rd Floor, 55/5, Vijaya Raghava Rd, Parthasarathi Puram, T. Nagar, Chennai, Tamil Nadu 600017";
    SurgeTech(){
        System.out.println("This is a default constructor");
        System.out.println(address);
        System.out.println();
    }
    SurgeTech(String add){
        this();//accessing default constructor in parameterized constructor
        address = add;//assigning given address to address data member
        System.out.println("This is a parameterized constructor");
        System.out.println(add);
        System.out.println();
    }
    SurgeTech(SurgeTech st){//Copy constructor
        address = st.address;
        System.out.println("This is a copy constructor");
        System.out.println(address);
        System.out.println();
    }
}
public class Assignment_2Ques2 {
    public static void main(String[] args) {
        String address = "3rd Floor, 55/5, Vijaya Raghava Rd, Parthasarathi Puram, T. Nagar, Chennai, Tamil Nadu 600017";
        SurgeTech sg = new SurgeTech();//prints=> This is a default constructor.
        SurgeTech sgt = new SurgeTech(address);//prints=> This is a parameterized constructor.
        SurgeTech s = new SurgeTech(sg);
    }
}
