public class Car {
    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;

    public Car (String name, int cylinders){
        this.name=name;
        this.cylinders=cylinders;
        this.wheels=4;
        this.engine=true;
    }

    public Boolean getEngine(){
        return this.engine;
    }

    public String getName(){
        return this.name;
    }

    public int getCylinders(){
        return this.cylinders;
    }

    public int getWheels(){
        return getWheels();
    }

    public void startEngine(){
        System.out.println("Engine started");
    }

    public void brake(){
        System.out.println("Car is braking");
    }

    public void accelerate(){
        System.out.println("Car is accelerating");
    }
}
