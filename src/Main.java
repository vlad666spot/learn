public class Main {

    /*
    * Write a method "areEqualByThreeDecimalPlaces"  of type double. The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise,
    * return false
    */
    public static void main(String[] args) {
        //here we call methods from lines 10 and 15)

        hasTeen(9,99,19);
        isTeen(9);
    }
    public static boolean hasTeen(int first, int second, int third){
        if (first >= 13 && first <=19){
            System.out.println("true");
            return true;
        } else if (second >= 13 && second <=19){
            System.out.println("true");

            return true;
        }else if (third >= 13 && third <=19){
            System.out.println("true");

            return true;
        } else {
            System.out.println("false");
            return false;
        }

    }

    public static boolean isTeen(int first){
        if (first >= 13 && first <=19){
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}

