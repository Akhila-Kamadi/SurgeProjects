class Surge{
    String address = "3rd Floor, 55/5, Vijaya Raghava Rd, Parthasarathi Puram, T. Nagar, Chennai, Tamil Nadu 600017";
    String location = "https://www.google.com/maps/dir/17.5029663,78.3182378/surge+technology+chennai/@15.2615805,77.2321566,7z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3a5267ad8e05d57b:0x707930a4e3574b53!2m2!1d80.2417433!2d13.0436655";
    public void print(){
        System.out.println(address);
        System.out.println(location);
    }
}
public class July19th {
    public static void main(String[] args) {
        Surge sg = new Surge();
        sg.print();
    }
}
