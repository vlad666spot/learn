public class Main {


    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }
    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }


        int sum = 0;
        int numberDecreasing = number;

        while (numberDecreasing>0){
            int lastDigit = numberDecreasing%10;
                if (lastDigit%2==0){
                    sum += lastDigit;
                }
            numberDecreasing = numberDecreasing/10;
        }
        return sum;
    }

    /* EXPLANATION
    * value / 10 = remove one char (last)
    * value * 10 = add one char (last, 0)
    * value % 10 = take last char
    *
    *
    *
    * */
}