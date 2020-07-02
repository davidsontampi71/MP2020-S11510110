public class Innova extends Car {

    public Innova(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Innova GT started");
    }

    @Override
    public void accelerate() {
        System.out.println("Innova GT Accelerated");
    }

    @Override
    public void brake() {
        System.out.println("Innova GT stopped, Brakes applied");
    }

}
