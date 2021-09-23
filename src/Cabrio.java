public class Cabrio extends Car {
    public Cabrio(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine(){
        System.out.println("Cabrio - started engine");
    }
}
