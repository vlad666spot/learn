public class Main {

    public static void main(String[] args) {

        //here we call methods from lines 10 and 15)
        displayHighScorePosition("Vlad", calculateHighScorePosition(3));
    }

    //create method:
    public static void displayHighScorePosition(String playersName, int position){
        System.out.println(playersName + " managed to get into position " + position + " on the high score table." );
    }

    //create method:
    public static int calculateHighScorePosition(int playerScore){
        if (playerScore>1000){
            return 1;
        } else if (playerScore>500 && playerScore<1000){
            return 2;
        } else if (playerScore>100 && playerScore<500){
            return 3;
        } else {
            return 4;
        }
    }
}
