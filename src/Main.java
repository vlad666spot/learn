public class Main {

    public static void main(String[] args) {
        //here we call methods from lines 10 and 15)

        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(5);
    }

    //here we define "calcFeetAndInchesToCentimeters" method, with 2 parameters
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double feetAndInchesToCentimiters = 0;
        if (feet >= 0) {
            if (inches >= 0 && inches <= 12) {
                double oneFootinCM = 30.48;
                double oneInchInCM = 2.54;
                feetAndInchesToCentimiters = feet*oneFootinCM + inches*oneInchInCM;
                System.out.println(feetAndInchesToCentimiters);
            } else {
                return -1;
            }
        } else {
            return -1;
        }

    return feetAndInchesToCentimiters;
    }

    //here we overload method "calcFeetAndInchesToCentimeters", main differences from previous - is other parameters
    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0) {
            return -1;
        }
        return calcFeetAndInchesToCentimeters(0,inches);
    }
}