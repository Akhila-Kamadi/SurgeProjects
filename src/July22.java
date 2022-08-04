/**
 * QUESTION:
 * Create classes and try implementing inheritance into it.
 *
 * Try to implement Interface.
 *
 * Use polymorphism in methods.
 */
interface Car{
    public void start();
}
class DieselCar implements Car{
    int speed;
    @Override
    public void start() {
        System.out.println("DieselCar is starting...");
    }
    void accelerate(){
        System.out.println("This car was just started..");
    }
    void accelerate(int speed){
        this.speed = speed;
        System.out.println("This car is going with a speed of "+speed+"km/hr");
    }
}
class Honda extends DieselCar{
    @Override
    public void start() {
        super.start();
        System.out.println("Honda Car is starting...");
    }
}
public class July22 {
    public static void main(String[] args) {
        DieselCar dc = new DieselCar();
        dc.start();

        dc = new Honda();
        dc.start();
        dc.accelerate();
        dc.accelerate(80);
    }
}
