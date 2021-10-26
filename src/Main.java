import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[]args){

        Set<String> cars = new HashSet<String>();
        cars.add("Ford");
        cars.add("Audi");
        cars.add("Bmw");
        cars.add("Mercedes");

        System.out.println(cars);
        System.out.println(cars.contains("Ford"));
        cars.remove("Ford");

        System.out.println("Is empty ? - "+cars.isEmpty());
        System.out.println("What size ? - "+cars.size());
        System.out.println(cars);
    }
}