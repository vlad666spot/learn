import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        reverse(fillArray(readInteger()));

    }


    public static int readInteger(){
        System.out.println("Please fill in counter");
        int count = scanner.nextInt();
        return count;
    }

    public static int[] fillArray(int count){
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Fill int next number (out of "+ count+" : ");
            array[i]=scanner.nextInt();
        }
        return array;
    }

    public static void reverse (int[] array){
        for (int i = array.length-1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
