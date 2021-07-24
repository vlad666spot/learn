public class Main {

    public static void main(String[] args) {
        //here we call methods from lines 10 and 15)
        printConversion(10.25);
    }

        // write your code here
        public static void printConversion (double kilometersPerHour){
            if (kilometersPerHour<0){
                System.out.println("Invalid Value");
            } else {
                double milesPerHour = toMilesPerHour(kilometersPerHour);
                System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h.");
            }
        }

        public static long toMilesPerHour (double kilometersPerHour){
        long miles = Math.round(kilometersPerHour/1.609);

        if (miles<0){
            return -1;
        } else {
            return miles;
        }}



}
