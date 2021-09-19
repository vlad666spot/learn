import java.awt.*;

public class Room {
    private String roomName;
    private int roomSpace;
    private AirConditioning airConditioning;
    private Windows windows;
    private Entertainment entertainment;
    private Light light;

    public Room (String roomName, int roomSpace, AirConditioning airConditioning, Windows windows, Entertainment entertainment, Light light){
        this.roomName = roomName;
        this.roomSpace = roomSpace;
        this.airConditioning = airConditioning;
        this.windows = windows;
        this.entertainment = entertainment;
        this.light = light;
    }

    public String getRoomName(){
        return this.roomName;
    }

    public int getRoomSpace(){
        return this.roomSpace;
    }

    public AirConditioning getAirConditioning() {
        return this.airConditioning;
    }

    public Windows getWindows(){
        return this.windows;
    }

    public Entertainment getEntertainment() {
        return this.entertainment;
    }

    public Light getLight(){
        return this.light;
    }
}
