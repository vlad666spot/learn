public class Main {

    /*
    * Write a method "areEqualByThreeDecimalPlaces"  of type double. The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise,
    * return false
    */
    public static void main(String[] args) {
        //here we call methods from lines 10 and 15)

        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
    }

    public static boolean areEqualByThreeDecimalPlaces(double myFirstDouble, double mySecondDouble){
        int myFirstCheck = (int)(myFirstDouble * 1000);
        int mySecondCheck = (int)(mySecondDouble * 1000);
        if(myFirstCheck - mySecondCheck == 0){

            return true;
        } else

            return false;

    }
}

