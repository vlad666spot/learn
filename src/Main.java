import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(81,153));
    }



    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        ArrayList<Integer> firstArray = new ArrayList<Integer>();
        ArrayList<Integer> secondArray = new ArrayList<Integer>();
        ArrayList<Integer> biggest = new ArrayList<>();
        for (int i = 1; i <= first; i++) {

            if (first % i == 0) {
                firstArray.add(i);
                //System.out.println(i);
            }
        }

        for (int i = 1; i <= second; i++) {

            if (second % i == 0) {
                secondArray.add(i);
                //System.out.println(i);
            }
        }

        for (int i = 0; i < firstArray.size(); i++) {
            int numberOfFirstArray = firstArray.get(i);
            for (int j = 0; j < secondArray.size(); j++) {
                int numberOfSecondArray = secondArray.get(j);
                if (numberOfFirstArray==numberOfSecondArray){
                    biggest.add(numberOfFirstArray);
                }
            }
        }

        int bigVal = 0;
        for (int i = 0; i < biggest.size(); i++) {
            biggest.get(i);
            if (biggest.get(i)>bigVal){
                bigVal=biggest.get(i);
            }
        }

    return bigVal;
    }
}