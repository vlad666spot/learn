 public class Main {
    public static void main(String[] args) {
        Car car = new Car( 8, "Base Concept");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Ford ford = new Ford(6, "Mondeo");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Mitsubishi mitsubishi = new Mitsubishi(7, "Eclipse");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Holden holden = new Holden(5, "Ultra");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }
}