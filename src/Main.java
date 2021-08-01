public class Main {

    /*
    * Write a method "areEqualByThreeDecimalPlaces"  of type double. The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise,
    * return false
    */
    public static void main(String[] args) {
        //here we call methods from lines 10 and 15)

        areEqualByThreeDecimalPlaces(2.2, 5.2);
    }

  public static boolean areEqualByThreeDecimalPlaces(double first, double second){
        String firstDoubleToString = String.valueOf(first);
        int indexFirstOfDecimal = firstDoubleToString.indexOf(".");
        int fistInt = Integer.parseInt(firstDoubleToString.substring(indexFirstOfDecimal,3).replace(".", ""));

        String secondDoubleToString = String.valueOf(second);
        int indexSecondOfDecimal = secondDoubleToString.indexOf(".");
        int secondInt = Integer.parseInt(secondDoubleToString.substring(indexSecondOfDecimal,3).replace(".", ""));

        if (fistInt == secondInt){
            return true;
        } else {
            return false;
        }
  }
}

