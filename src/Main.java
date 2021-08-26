public class Main {


    public static void main(String[] args) {
        //System.out.println(canPack(1,0,5));
        //reverse(234);

        System.out.println(canPack(1,0,4));
        //System.out.println(%5);
    }
    public static boolean canPack (int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        //
            int calc = bigCount * 5 + smallCount;

            if (calc >= goal){
                    if(goal%5<=smallCount){
                        return true;
                    } else {
                        return false;
                    }
            } else {
                return false;
            }
    }
}