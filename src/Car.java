public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gear;
    private boolean isManual;

    private int currentGear;
    private int currentVelocity;

    public Car (String name, String size, int wheels, int doors, int gear, boolean isManual, int currentGear){
        super(name,size);
        this.wheels=wheels;
        this.doors=doors;
        this.gear=gear;
        this.isManual=isManual;
        this.currentGear=currentGear;
    }

    public void changeGear(int currentGear){
        this.currentGear=currentGear;
        System.out.println("Car.setCurrentGear(): Changed to " + this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction){
        move(speed, direction);
        System.out.println("Car changeVelocity() : Velocity "+ speed+ " direction "+ direction);
    }

    public int currentVelocity(){
        return this.currentVelocity;
    }


}