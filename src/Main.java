public class Main {


    public static void main(String[] args) {
        Point x = new Point(6,5);
        Point y = new Point(3,1);

        System.out.println("X "+ x.getX());
        System.out.println("Y "+ y.getY());
        System.out.println("Distance "+ x.distance(y));
        System.out.println("Distance "+ x.distance());
        System.out.println("Distance "+ x.distance(2,2));

        Point point = new Point();
        System.out.println("Distance "+ point.distance());

    }

}