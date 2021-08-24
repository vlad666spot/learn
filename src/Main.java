public class Main {


    public static void main(String[] args) {
        System.out.println(getEventDigitSum(123456789));
    }
    public static int getEventDigitSum(int number){
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
}