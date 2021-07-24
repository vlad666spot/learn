public class Main {

    public static void main(String[] args) {
        //here we call methods from lines 10 and 15)
        printMegaBytesAndKiloBytes(0);
    }

        // write your code here
    public static void printMegaBytesAndKiloBytes (int kiloBytes){
        if (kiloBytes<0){
            System.out.println("Invalid Value");
        }
        else {
            int mbOfKiloBytes = kiloBytes / 1024;
            int remain = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + mbOfKiloBytes + " MB and " + remain + " KB");
        }
    }



}
