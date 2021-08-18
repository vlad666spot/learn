public class Main {
    private static final int YEAR_IN_MINUTES = 525600;
    private static final int DAY_IN_MINUTES = 1440;

    public static void main(String[] args) {

        System.out.println(isCatPlaying(true,40));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer==false) {
            if(temperature>24 && temperature<=35){
                return true;
            } else {
                return false;
            }

        } else {
            if(temperature>24 && temperature<=45){
                return true;
            } else {
                return false;
            }
        }
    }
}