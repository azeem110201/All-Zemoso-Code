package phone;

import java.util.HashMap;
import java.util.Map;

public class AddContactInIphone implements AddContact {
    private Map<String, String> contacts = new HashMap<>();

    @Override
    public void addContact(String name, String phoneNumber){
        if(this.contacts.size() == 0){
            this.contacts.put(phoneNumber, name);
            return;
        }

        for(int i = 0; i < this.contacts.size(); i++){
            if(!(this.contacts.containsKey(phoneNumber)) || !(this.contacts.containsValue(name))){
                this.contacts.put(phoneNumber, name);
                return;
            }
        }
        System.out.println("Contact with the same name exist");
    }

    @Override
    public Map<String, String> getAllContacts(){
        if(this.contacts.size() == 0){
            return null;
        }
        return this.contacts;
    }
}
