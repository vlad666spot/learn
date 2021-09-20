public class Main {


    public static void main(String[] args) {
        Printer hp = new Printer(50,true);
        System.out.println(hp.addToner(50));
        System.out.println("Initial page count: "+ hp.getPagesPrinted());
        int pagesPrinted = hp.printPages(4);
        System.out.println("Pages printed was "+ pagesPrinted+ " new total print count for printer = "+ hp.getPagesPrinted());
        pagesPrinted = hp.printPages(2);
        System.out.println("Pages printed was "+ pagesPrinted+ " new total print count for printer = "+ hp.getPagesPrinted());
    }
}