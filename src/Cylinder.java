public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double heigh) {
        super(radius);
        if (heigh<0){
            this.height = 0;
        } else {
        this.height = heigh;
        }
    }

    public double getHeight(){
        return this.height;
    }

    public double getVolume(){
        return getArea()*getHeight();
    }
}
