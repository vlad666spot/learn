public class Vehicle {
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size){
        this.size=size;
        this.name = name;
    }

    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentDirection + " in Direction: " + currentDirection);
    }

    public void stop (){
        this.currentVelocity = 0;
    }
}
