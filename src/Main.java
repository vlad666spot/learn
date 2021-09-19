import java.awt.*;

public class Main {


    public static void main(String[] args) {
        AirConditioning airConditioning = new AirConditioning(true);
        Entertainment entertainment = new Entertainment(true,1,7,2);
        Floor floor = new Floor("parquet");
        Furniture furniture = new Furniture("Sofa");
        Light light = new Light(5);
        Windows windows = new Windows(4);

        Room livingRoom = new Room("Living Room",6,airConditioning,windows,entertainment,light);
        livingRoom.getAirConditioning().heatTemperature(6);
        livingRoom.getAirConditioning().coolTemperature(2);
        livingRoom.getEntertainment().roomEntertaiment();
        livingRoom.getLight().roomLight();
        livingRoom.getWindows().getWindows();
    }
}