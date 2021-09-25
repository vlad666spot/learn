import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int [] testVlad = getIntegers(5);
        printArray(sortArray(testVlad));


    }

    public static int[] getIntegers(int capacity){
        int[] array = new int[capacity];
        System.out.println("Please enter "+ capacity + " integer values:\r");
        for (int i = 0; i < capacity; i++) {
            array[i]=scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            }
      }

    public static int[] sortArray(int[] array){
        //bubble sorting
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    isSorted = false;
                }
            }

        }
        return array;
    }
}

