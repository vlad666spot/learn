public class Main {


    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(12, 19, 119));
        System.out.println(isValid(9));

    }
    public static boolean hasSameLastDigit (int one, int two, int three){
        if(one<10 || one>1000 || two<10 || two>1000 || three<10 || three>1000){
            return false;
        }

        int lastOne = one%10;
        int lastTwo = two%10;
        int lastThree = three%10;

        if (lastOne == lastTwo || lastTwo == lastThree || lastThree ==lastOne){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValid (int number){
        if(number>9 && number <1001){
            return true;
        }
        else {
            return false;
        }
    }
}