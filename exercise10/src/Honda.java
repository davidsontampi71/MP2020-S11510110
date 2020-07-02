public class Honda extends Car {

    public Honda(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Honda Jazz started");
    }

    @Override
    public void accelerate() {
        System.out.println("Honda Jazz Accelerated");
    }

    @Override
    public void brake() {
        System.out.println("Honda Jazz stopped, Brakes applied");
    }

}