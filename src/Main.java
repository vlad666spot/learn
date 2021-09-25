import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please fill in counter");

        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        System.out.println(findMin(readIntegers(count)));
    }

    public static int[] readIntegers(int count){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];
        System.out.println("Please fill in int");
        for (int i = 0; i < count; i++) {
            array[i]=scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int [] array){
        int minVal = Integer.MAX_VALUE;;
        for (int i = 0; i < array.length; i++) {
            if (minVal>array[i]){
                minVal=array[i];
            }
        }
        return minVal;
    }

}
