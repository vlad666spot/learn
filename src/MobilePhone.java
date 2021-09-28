import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String phoneNumber){
        this.myNumber=phoneNumber;
        this.myContacts=new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName())>=0){
            System.out.println("Contact with such name exist already");
            return false;
        } else {
            myContacts.add(contact);
            return true;
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        if(findContact(oldContact)!=-1){
            myContacts.set(findContact(oldContact),newContact);
            return true;
        } else {
            System.out.println("There no exist such contact");
            return false;
        }
    }

    public boolean removeContact(Contact contact){
        if(findContact(contact)!=-1){
            myContacts.remove(findContact(contact));
            System.out.println("Contact was deleted");
            return true;
        } else {
            System.out.println("Contact with such name doesn't exist");
            return false;
        }
    }

    private int findContact (Contact contact){
        for (int i = 0; i < myContacts.size(); i++) {
            if(myContacts.get(i).getName()==contact.getName()){
                return i;
            }
        }
        return -1;
    }

    private int findContact (String name){
        for (int i = 0; i < myContacts.size(); i++) {
            if(myContacts.get(i).getName()==name){
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact (String name){
        for (int i = 0; i < myContacts.size(); i++) {
            if(myContacts.get(i).getName()==name){
                return myContacts.get(i);
            }
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(i+1 +". "+myContacts.get(i).getName()+" -> "+myContacts.get(i).getPhoneNumber());
        }
    }
}
