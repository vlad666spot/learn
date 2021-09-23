public class Truck extends Car {
    public Truck(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void brake(){
        System.out.println("Truck is bracking");
    }
}
