import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
    inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage (){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;
        while(true){
            if (scanner.hasNextInt()){
                int number = scanner.nextInt();
                scanner.nextLine();
                sum += number;
                counter++;
            } else {
                if(counter==0){

                    System.out.println("SUM = " + 0 + " AVG = " + 0);
                    break;
                }
                counter++;
                System.out.println("SUM = " + sum + " AVG = " + Math.round(sum/counter));

                break;
            }
        }
        scanner.close();
    }
}