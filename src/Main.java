import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("096354213");

    public static void main(String[] args) {
        startPhone();
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    System.out.println("\n Shutting down... ");
                    quit=true;
                    break;
                case 1:
                    printListOfContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printInstructions();
                    break;
            }
        }
    }
    public static void printInstructions(){
        System.out.print("\nPress");
        System.out.print("\n 0 - Shut the phone.");
        System.out.print("\n 1 - To print the list of contacts.");
        System.out.print("\n 2 - To add new contact.");
        System.out.print("\n 3 - To modify existing contact.");
        System.out.print("\n 4 - To remove contact.");
        System.out.print("\n 5 - To search contact.");
        System.out.print("\n 6 - Print actions.");

    }

    public static void printListOfContacts(){
        mobilePhone.printListOfContacts();
    }

    public static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String number = scanner.nextLine();
        Contact newContact = new Contact(name, number);
        mobilePhone.addNewContact(newContact);
    }

    public static void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactrecord = mobilePhone.queryContact(name);

        if(existingContactrecord==null){
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number: ");
        String newPhoneNmb = scanner.nextLine();

        Contact newContact = new Contact(newName, newPhoneNmb);
        mobilePhone.updateExistingContact(existingContactrecord,newContact);
    }

    public static void removeContact(){
        System.out.println("Enter contact name for delete: ");
        String nameForDelete = scanner.nextLine();

        Contact contactForDelete = mobilePhone.queryContact(nameForDelete);

        if(contactForDelete==null){
            System.out.println("Contact not found");
            return;
        }

        mobilePhone.removeContact(contactForDelete);
    }

    public static void startPhone(){
        System.out.println("Starting phone... ");
    }
    
    public static void queryContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord==null){
            System.out.println("Contact not found");
            return;
        }
    }
}
