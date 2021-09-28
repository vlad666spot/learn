public class Main {


    public static void main(String[] args) {
        MobilePhone lg = new MobilePhone("8765");
        Contact s = new Contact("SSSS", "09876543");
        System.out.println(lg.addNewContact(s));
    }
}
