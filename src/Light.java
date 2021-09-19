public class Light {
    private int bulbquantity;

    public Light(int bulbquantity){
        this.bulbquantity=bulbquantity;
    }

    public int getBulbQuantity(){
        return this.bulbquantity;
    }

    public void roomLight(){
        System.out.println("At the room - there are located "+ getBulbQuantity()+ " bulbs");
    }
}
