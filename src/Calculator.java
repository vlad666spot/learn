public class Calculator {
    private Floor floor;
    private Carpet carpet;


    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }

    public Floor getFloor() {
        return floor;
    }

    public Carpet getCarpet() {
        return carpet;
    }


    public double getTotalCosts(){
       return floor.getArea()*carpet.getCost();
    }
}
