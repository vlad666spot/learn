public class Main {


    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
    }

    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }
        int num=number;
        int lastDigit = num%10;
        while(num>9){
            num = num/10;
        }
        return lastDigit+num;
    }
}