 public class Main {
    public static void main(String[] args) {
        //class from which we will extend
        Car auto = new Car("Bmw",4);
        auto.startEngine();
        auto.accelerate();
        auto.brake();
        System.out.println("!--DIVIDER--!\n");
        //class which we inherited from car and in which we make @Override
        Cabrio lexus = new Cabrio("Lexus",4);
        lexus.startEngine();
        lexus.accelerate();
        lexus.brake();
        System.out.println("!--DIVIDER--!\n");
        //class which we inherited from car and in which we make @Override (second time)
        Truck man = new Truck("Man", 12);
        man.startEngine();
        man.accelerate();
        man.brake();
    }
}