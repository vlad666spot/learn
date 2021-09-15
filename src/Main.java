public class Main {


    public static void main(String[] args) {
        Cabrio bmw = new Cabrio("Bmw",5,true,0,true);
        bmw.changeGear(5);
        bmw.accelerate(40);
        bmw.accelerate(20);
    }
}