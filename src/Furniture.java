public class Furniture {
    private String furniture;

    public Furniture(String furniture){
        this.furniture=furniture;
    }

    public String getFurniture(){
        return this.furniture;
    }

    public void roomFurniture(){
        System.out.println("Room has: "+getFurniture()+ " furniture");
    }
}
