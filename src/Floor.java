public class Floor {
    private String floorType;

    public Floor(String floorType){
        this.floorType=floorType;
    }

    public String getFloorType(){
        return this.floorType;
    }

    public void roomFloor(){
        System.out.println("Room has: " + getFloorType()+ " floor");
    }
}
