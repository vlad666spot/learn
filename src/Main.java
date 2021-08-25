public class Main {


    public static void main(String[] args) {
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number){
        if(number<1){
            return false;
        }

        int sumOfDividers = -number;
        for (int i = 1; i <= number; i++) {
            if(number%i==0){
                sumOfDividers += i;
                //System.out.println(i+" ");
            }
        }
        System.out.println("Sum of dividers " + sumOfDividers);

        boolean isPerfectNumber = (sumOfDividers==number);

        if (isPerfectNumber==true){
            return true;
        } else {
        return false;
    }
    }

    //perfercNumber = divisor + divisoe
    //divisor %= perfercrNUmber;
}