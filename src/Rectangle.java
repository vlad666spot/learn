public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length){
        this.length = length;
        this.width = width;
        if(width<0){
            this.width=0;
        }
        if (length<0){
            this.length=0;
        }
    }

    public double getWidth(){
        return this.width;
    }

    public double getLength(){
        return this.length;
    }

    public double getArea(){
        return (getWidth()*getLength());
    }
}
