import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList <Contact> contacts;


    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.contacts=new ArrayList<Contact>();
    }

    public void printListOfContacts(){
        System.out.println("You have in contacts: "+ contacts.size());
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println("Contact #: "+i+" is "+contacts.get(i).getName());
        }
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName())>=0){
            System.out.println("Contact is already on file");
            return false;
        }

        contacts.add(contact);
        return true;
    }

    public boolean updateExistingContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition<0){
            System.out.println(oldContact.getName()+", was not found.");
            return false;
        }
        this.contacts.set(foundPosition,newContact);
        System.out.println(oldContact.getName()+", was replaced with "+newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if(foundPosition<0){
            System.out.println(contact.getName()+", was not found.");
            return false;
        }
        this.contacts.remove(foundPosition);
        System.out.println(contact.getName()+", was deleted.");
        return true;
    }

    public int findContact(Contact contact){
        return this.contacts.indexOf(contact);
    }

    public int findContact(String searchQuery){
        for (int i = 0; i < this.contacts.size(); i++) {
            Contact contact = this.contacts.get(i);
            if(contact.getName().equals(searchQuery)){
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact){
        if (findContact(contact)>=0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if(position>0){
            return this.contacts.get(position);
        }
        return null;
    }


}
