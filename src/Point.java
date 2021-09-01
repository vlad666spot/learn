public class Point {
    private int x;
    private int y;

    public Point(){

    }

    public Point(int x, int y){
        this.x = x;
        this.y=y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void setX(int x){
        this.x=x;
    }

    public void setY(int y){
        this.y=y;
    }

    public double distance(){
        return Math.sqrt((getX())*(getX())+(getY())*(getY()));
    }

    public double distance(int x, int y){
        return Math.sqrt((getX()-x)*(getX()-x)+(getY()-y)*(getY()-y));
    }

    //method with parameter of another type java
    public double distance(Point otherPoint){
        return Math.sqrt((getX()-otherPoint.getX())*(getX()-otherPoint.getX())+(getY()-otherPoint.getY())*(getY()-otherPoint.getY()));
    }
}
