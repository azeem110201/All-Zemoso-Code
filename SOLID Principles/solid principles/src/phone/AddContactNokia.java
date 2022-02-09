package phone;

import java.util.HashMap;
import java.util.Map;

public class AddContactNokia implements AddContact {
    private final Map<String, String> contacts = new HashMap<>();

    @Override
    public void addContact(String name, String phoneNumber){
        if(this.contacts.size() == 0){
            this.contacts.put(phoneNumber, name);
            return;
        }

        for(int i = 0; i < this.contacts.size(); i++){
            if(!(this.contacts.containsKey(phoneNumber))){
                this.contacts.put(phoneNumber, name);
                return;
            }
            else{
                System.out.println("Contact with the same name exist");
                break;
            }
        }
    }

    @Override
    public Map<String, String> getAllContacts(){
        if(this.contacts.size() == 0){
            return null;
        }
        return this.contacts;
    }
}
