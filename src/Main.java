public class Main {


    public static void main(String[] args) {
        System.out.println(hasSharedDigit(22, 72));
    }
    public static boolean hasSharedDigit (int one, int two){
        if(one<11 && one>-100 || two<11 && two>-100){
            return false;
        }

        int lastNumberOfOne = one%10;
        int firstNumberOfOne = one/10;
        int lastNumberOfTwo = two%10;
        int firstNumberOfOTwo = two/10;

        if (lastNumberOfOne == lastNumberOfTwo || lastNumberOfOne==firstNumberOfOTwo || firstNumberOfOne== firstNumberOfOTwo || firstNumberOfOne ==lastNumberOfTwo){
            return true;
        } else {
            return false;
        }
    }
}