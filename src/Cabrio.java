public class Cabrio extends Car {
    static boolean convertible;

    public Cabrio(String name, int gear, boolean isManual, int currentGear, boolean convertible) {
        super(name, "Cabrio", 4, 2, gear, isManual, currentGear);
        this.convertible=convertible;
    }

    public void accelerate(int rate){
        int newVelocity = currentVelocity() + rate;
        if(newVelocity ==0){
            stop();
        } else if(newVelocity>0 && newVelocity<=10){
            changeGear(1);
        } else if(newVelocity>10 && newVelocity<=20){
            changeGear(2);
        } else if(newVelocity>20 && newVelocity<=30){
            changeGear(3);
        } else {
            changeGear(4);
        }
    }
}
