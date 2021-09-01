public class Wall {
    private double height;
    private double width;

    public Wall(){

    }

    public Wall(double width, double height){
        setWidth(width);
        setHeight(height);
    }


    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWidth(double width){
        this.width = width;

        if(width<0){
            this.width = 0;
        }
    }

    public void setHeight(double height){
        this.height = height;

        if(height<0){
            this.height = 0;
        }

    }

    public double getArea(){
        return (this.height)*(this.width);
    }
}
