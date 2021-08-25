public class Main {


    public static void main(String[] args) {
        numberToWords(1000);
        //reverse(234);
    }

    public static void numberToWords (int number){
        if(number<0){
            System.out.println("Negative Value");
        }

        int counter = getDigitCount(number);
        int copyOfNumber =reverse(number);

        for(int i = 0; i<counter; i++){
            int lastDigitOfNumber = copyOfNumber%10;
            switch (lastDigitOfNumber){
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }

            copyOfNumber = copyOfNumber/10;
        }
    }

    public static int reverse (int number){
        int lastDigit;
        String returnValure = "";
        while(number>0){
            lastDigit = number%10;
            number = number/10;
            returnValure += ""+lastDigit;
        }
        return Integer.parseInt(returnValure);
    }

    public static int getDigitCount(int number){
        if(number<0){
            return -1;
        }

        int countOfDigitsInNumber = 0;
        while(number!=0){
            countOfDigitsInNumber++;
            number = number/10;
        }

        return countOfDigitsInNumber;

    }
}