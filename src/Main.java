import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        printFactors(-1);
    }
    
    public static void printFactors (int number){
        if(number<1){
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= number; i++) {
            while(number%i==0){
                System.out.print(i + " ");
                i++;
            }
        }
    }
}