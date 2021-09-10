
public class Main {


    public static void main(String[] args) {
        String string = "I am a string. Yes, I am.";
        System.out.println(string);

        String yourString = string.replaceAll("^I","You"); // ^ (called caret) - means only at the beginning, $ means only at the end,
        System.out.println(yourString);
        System.out.println(yourString.replaceAll("Yes, I am.$", "NO, I am NOT.")); //explanation at row 10


        String alphaNumeric = "asdcF234KJHGFDbndwhfgehjkdwfj765z";
        System.out.println(alphaNumeric.replaceAll(".","Y")); // . - means all chars in string


        System.out.println(alphaNumeric.replaceAll("^asdcF234", "First_Part: "));

        String secondString = "asdcF234KJHGFDbndwhfgasdcF234ehjkdwfj765z";
        System.out.println(secondString.replaceAll("^asdcF234", "FirstPart: "));

        System.out.println(alphaNumeric.matches("^hello"));
        System.out.println(alphaNumeric.matches("^asdcF234")); //will return false, in case of using match - you should give regex of whole string, because partially it will not work

        System.out.println(alphaNumeric.replaceAll("[d]", " VLAD ")); //match specific letter or set of letters (all occurencies)
        System.out.println(alphaNumeric.replaceAll("[F][234]", " VLAD ")); // "f" followed by "234"  -> then will replace, otherwise - NOT

    }
}