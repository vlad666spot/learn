public class Main {
    private static final int YEAR_IN_MINUTES = 525600;
    private static final int DAY_IN_MINUTES = 1440;

    public static void main(String[] args) {

        printEqual(1, 1,1);
    }

    public static void printEqual(int first, int second, int third) {
        if (first < 0 || second < 0 || third < 0) {
            System.out.println("Invalid Value");
        } else {

            if (first == second && second == third && third == first) {
                System.out.println("All numbers are equal");
            } else if (first != second && second != third && third != first) {
                System.out.println("All numbers are different");
            } else {
                System.out.println("Neither all are equal or different");
            }
        }
    }
}