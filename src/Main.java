public class Main {

    public static void main(String[] args) {
        //here we call methods from lines 10 and 15)
        System.out.println(isLeapYear(1924));
    }

        // write your code here
        public static boolean isLeapYear (int year){
        boolean isLeapYear = false;
            if (year>1 && year<=9999){
                if(year%4==0){
                    if (year%100==0){
                        if (year%400==0){
                            isLeapYear = true;
                        }}else {
                        isLeapYear = true;
                    }
                }
            } else {
                isLeapYear = false;
            }
            return isLeapYear;
        }
}
