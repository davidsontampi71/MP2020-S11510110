public class Hyundai extends Car {

    public Hyundai(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Hyundai Avega started");
    }

    @Override
    public void accelerate() {
        System.out.println("Hyundai Avega Accelerated");
    }

    @Override
    public void brake() {
        System.out.println("Hyundai Avega stopped, Brakes applied");
    }

}