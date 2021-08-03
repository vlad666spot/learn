public class Main {

    public static void main(String[] args) {
        //here we call methods from lines 10 and 15)

        System.out.println(getDurationString(63, 59));
        System.out.println(getDurationString(321));
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes<0 || seconds<0 || seconds>59){
            return "Invalid value";
        }
        int calculatedHours;
        int calculatedMinutes;

        calculatedHours = minutes/60;
        calculatedMinutes = minutes%60;

        return calculatedHours+"h "+calculatedMinutes+"m "+seconds+"s";
    }

    public static String getDurationString(long seconds){
        if(seconds<0){
            return "Invalid value";
        }

        int calculatedMinutes;
        int calculatedSeconds;

        calculatedMinutes = (int)seconds/60;
        calculatedSeconds = (int)seconds%60;

        return getDurationString(calculatedMinutes,calculatedSeconds);
    }

}