public class Main {
    private static final int YEAR_IN_MINUTES = 525600;
    private static final int DAY_IN_MINUTES = 1440;

    public static void main(String[] args) {

        printYearsAndDays(561600);
    }

    public static void printYearsAndDays(long minutes){
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {


            int years;
            int days;
            years = (int) minutes / YEAR_IN_MINUTES;
            days = (int) minutes % YEAR_IN_MINUTES / DAY_IN_MINUTES;


            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }

}