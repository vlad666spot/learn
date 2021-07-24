public class Main {

    public static void main(String[] args) {
        //here we call methods from lines 10 and 15)
        System.out.println(shouldWakeUp(true, 44));
    }

        // write your code here
        public static boolean shouldWakeUp(boolean barking, int hourOfDay){
            boolean shouldWake = false;
            if (!barking){
                shouldWake = false;
            }

            if (barking){
                if (hourOfDay>23){
                    shouldWake = false;
                }
                if (hourOfDay<0){
                    shouldWake = false;
                }
                if (hourOfDay>=8){
                    shouldWake = false;
                }
                if (hourOfDay>=0 && hourOfDay<8){
                    shouldWake = true;
                }
                if (hourOfDay>22 && hourOfDay<24){
                    shouldWake = true;
                }
            }
            return shouldWake;
    }
}
