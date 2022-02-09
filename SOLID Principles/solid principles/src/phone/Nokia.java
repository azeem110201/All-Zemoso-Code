package phone;

import java.util.Map;

public class Nokia implements Phone{
    private final AddContact addContact;
    public Nokia(AddContact addContact){
        this.addContact = addContact;
    }


    public Map<String, String> getAllContacts(){
        if(this.addContact.getAllContacts() != null)
            return this.addContact.getAllContacts();

        return null;
    }

    @Override
    public void calling(String phoneNumber){
        System.out.println("Calling " + phoneNumber + "........");
    }

    @Override
    public void ringing(){
        System.out.println("Your Nokia is ringing");
    }
}
