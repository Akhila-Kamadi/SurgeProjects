/**
 * Implementing Encapsulation which is a way of bundling data together
 * And Data Hiding using private access modifier and getters and setters which prevents
 * external unauthorized access to the sensitive data.
 */
//calculate the perimeter of a rectangle
class Perimeter{
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    // Method that calculates the perimeter of a rectangle
    private int perimeter(){
        int peri = 2 * (length + breadth);
        return peri;
    }
    public void printPerimeter(){
        int peri = perimeter();
        System.out.println("Perimeter of rectangle is "+peri);
    }
}
public class July28_Encapsulation {
    public static void main(String[] args) {
        Perimeter p = new Perimeter();
        p.setBreadth(5);
        p.setLength(10);
        p.printPerimeter();
    }
}
