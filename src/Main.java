
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

        System.out.println("Harry".replaceAll("[Hh]arry", "Harry")); // find Harry, with no dependency over capital/lower letters Hh

        System.out.println(alphaNumeric.replaceAll("[^ej]", "X")); //replace every letter, except of something (letter "i" and "j"), here "^" caret should be inside []
        System.out.println(alphaNumeric.replaceAll("[a-f1-2]", "Z")); //replace letters (from alphabet: a-f) and numbers from 1 to 2

        System.out.println(alphaNumeric.replaceAll("[kj]", "KJ DETECTED")); //replace all "kj" only small letters
        System.out.println(alphaNumeric.replaceAll("(?i)[kj]", "KJ DETECTED")); //replace all "kj" with no dependencies over Capital or not

        System.out.println(alphaNumeric.replaceAll("[0-9]", " !Replaced DIGIT! ")); // replace digits from 0 to 9, same result as at 38 row
        System.out.println(alphaNumeric.replaceAll("\\d", " !Replaced DIGIT! ")); // replace digits from 0 to 9 (\\d - declaration of digit, in regular expression)
        System.out.println(alphaNumeric.replaceAll("\\D", " *non digit replace* "));//replace all NON digits (letters)

        String hasWhiteSpace = "I have Blanks and \ta tab, and also a newline\n";
        System.out.println(hasWhiteSpace.replaceAll("\\s",""));//remove white space ( probil )
        System.out.println(hasWhiteSpace.replaceAll("\t", "X")); //remove tab character
        System.out.println(hasWhiteSpace.replaceAll("\\S","")); //remove all NON white space (probil)
        System.out.println(hasWhiteSpace.replaceAll("\\w", "C")); //remove a-z , A-Z, 0-9, apart of white space ( probil )
        System.out.println(hasWhiteSpace.replaceAll("\\W", "C")); //remove all apart of a-z , A-Z, 0-9, ( so white space ( probil ))
        System.out.println(hasWhiteSpace.replaceAll("\\b","*")); //surround word by char (good to wrap in html tags) 





        String spotTest = " { { s o m e v a l u e } } ";
        System.out.println(spotTest.replaceAll("[{}]", "issue detected"));
    }
}