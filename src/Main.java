public class Main {


    public static void main(String[] args) {
        printDayOfTheWeek(-2);
}

    public static void printDayOfTheWeek (int day){
        if(day<0 || day>6){
            System.out.println("Invalid day");
        }

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }
    }
}